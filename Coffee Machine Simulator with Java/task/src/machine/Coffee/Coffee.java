package machine.Coffee;

import machine.CoffeeMachine;
import machine.Status;

public class Coffee {
    int water;
    int milk;
    int beans;
    int cost;

    public Coffee(int water, int milk, int beans, int cost){
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cost = cost;
    }

    public void makeCoffee(CoffeeMachine machine) {
        if (machine.totalWater >= water && machine.totalBeans >= beans) {
            machine.enoughResources();
            machine.cupUsed();
            machine.totalWater -= water;
            machine.totalMilk -= milk;
            machine.totalBeans -= beans;
            machine.totalMoney += cost;
        } else {
            if (machine.totalWater < water) System.out.println("Sorry, not enough water!");
            if (machine.totalBeans < beans) System.out.println("Sorry, not enough coffee beans!");
        }
    }
}
