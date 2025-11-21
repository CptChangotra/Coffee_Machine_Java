package machine;

import machine.Coffee.Cappuccino;
import machine.Coffee.Espresso;
import machine.Coffee.Latte;

import java.util.Scanner;

import static java.lang.Math.min;
import static machine.Status.*;

public class CoffeeMachine {
    public int totalMoney;
    public int totalWater;
    public int totalMilk;
    public int totalBeans;
    public int totalDisposableCups;
    public Status status;
    public int cupsSold;
    public Scanner sc;

    public CoffeeMachine(){
        totalMoney = 550;
        totalWater = 400;
        totalMilk = 540;
        totalBeans = 120;
        totalDisposableCups = 9;
        status = CLEANED;
        cupsSold = 0;
        sc = new Scanner(System.in);

    }

    public void action() {
        while (true) {
            System.out.print("Write action (buy, fill, take, clean, remaining, exit): \n");
            String input = sc.nextLine();
            if (input.equals("exit")){
                return;
            }
            switch (input) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "clean" -> clean();
                case "remaining" -> printStats();
                default -> throw new IllegalArgumentException("buy || fill || take");
            }
        }
    }

    public void clean() {
        this.status = CLEANED;
        System.out.println("I have been cleaned!");
    }

    public void cupUsed() {
        cupsSold++;
        totalDisposableCups--;
        if (cupsSold % 10 == 0 && status == CLEANED) this.status = NEEDS_CLEANING;
    }

    public void printStats() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(this.totalWater + " ml of water");
        System.out.println(totalMilk + " ml of milk");
        System.out.println(totalBeans + " g of coffee beans");
        System.out.println(totalDisposableCups + " disposable cups");
        System.out.println("$" + totalMoney + " of money\n");
    }

    public void buy() {
        if (status == Status.NEEDS_CLEANING) {
            System.out.println("I need cleaning!");
            return;
        }
        System.out.print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu:\n> ");
        String input = sc.nextLine();
        if (input.equals("back")){
            return;
        } else {
            sale(Integer.parseInt(input));
        }
        System.out.println();
    }

    public void sale(int coffee) {
        switch (coffee){
            case (1):
                Espresso es = new Espresso();
                es.makeCoffee(this);
                break;
            case(2):
                Latte lt = new Latte();
                lt.makeCoffee(this);
                break;
            case(3):
                Cappuccino cp = new Cappuccino();
                cp.makeCoffee(this);
                break;
        }
    }

    public void enoughResources() {
        System.out.println("I have enough resources, making you a coffee!");
    }

    public void fill() {
        System.out.print("\nWrite how many ml of water you want to add: \n" );
        int waterToAdd = Integer.parseInt(sc.nextLine());
        totalWater += waterToAdd;
        System.out.print("Write how many ml of milk you want to add: \n" );
        int milkToAdd = Integer.parseInt(sc.nextLine());
        totalMilk += milkToAdd;
        System.out.print("Write how many grams of coffee beans you want to add: \n" );
        int beansToAdd = Integer.parseInt(sc.nextLine());
        totalBeans += beansToAdd;
        System.out.print("Write how many disposable cups you want to add: \n");
        int cupsToAdd = Integer.parseInt(sc.nextLine());
        totalDisposableCups += cupsToAdd;
        System.out.println();
    }

    public void take() {
        System.out.println("I gave you $" + totalMoney + "\n");
        totalMoney = 0;
    }
}