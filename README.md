# Coffee Machine Simulator ☕

A Java-based console application that simulates the workflow of a commercial coffee machine.

## 📖 Overview

This program models a coffee machine that can process user commands to buy coffee, fill ingredients, take money, and check the state of resources. It tracks the inventory of water, milk, coffee beans, disposable cups, and the total cash inside the machine.

## ✨ Features

- **Buy Coffee**: Select from three types of coffee:
  - **Espresso**: 250 ml water, 16 g beans, costs $4.
  - **Latte**: 350 ml water, 75 ml milk, 20 g beans, costs $7.
  - **Cappuccino**: 200 ml water, 100 ml milk, 12 g beans, costs $6.
- **Fill Supplies**: Add water, milk, coffee beans, and disposable cups to the machine.
- **Take Money**: Withdraw all accumulated cash from the internal register.
- **Resource Tracking**: The machine checks if it has enough ingredients before making a coffee.
- **Status Check**: Display the current quantity of all supplies and money.

## 🛠️ Tech Stack

- **Language**: Java
- **Project Type**: Console Application

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 23 installed.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/CptChangotra/Coffee_Machine_Java.git
   ```

2. Open it in your IDE
   
3. Navigate to Coffee Machine Simulator with Java/task/src/machine/Main.java

4. Run main

## 💻 Usage Example

```text
Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> exit
```

## 🤝 Contributing

Contributions are welcome! If you have suggestions for improvements or new features, feel free to open an issue or submit a pull request.

## 🔔 Disclaimer
This project is part of the **Hyperskill (JetBrains Academy)** curriculum.
Based on the project: [Coffee Machine Simulator with Java](https://hyperskill.org/projects/33)
```

