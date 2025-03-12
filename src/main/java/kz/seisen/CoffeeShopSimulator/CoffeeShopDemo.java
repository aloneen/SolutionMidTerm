package kz.seisen.CoffeeShopSimulator;

import kz.seisen.CoffeeShopSimulator.Coffies.Coffee;
import kz.seisen.CoffeeShopSimulator.Decorator.CaramelSyrupDecorator;
import kz.seisen.CoffeeShopSimulator.Decorator.ChocolateSyrupDecorator;
import kz.seisen.CoffeeShopSimulator.Decorator.MilkDecorator;
import kz.seisen.CoffeeShopSimulator.Decorator.WhippedCreamDecorator;
import kz.seisen.CoffeeShopSimulator.FactoryMethod.CoffeeFactory;
import kz.seisen.CoffeeShopSimulator.FactoryMethod.ConcreteCoffeeFactory;

import java.util.Scanner;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeFactory factory = new ConcreteCoffeeFactory();

        // Step 1: Choose a coffee base
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Choose a coffee base:");
        System.out.println("1. Espresso");
        System.out.println("2. Cappuccino");
        System.out.println("3. Latte");
        System.out.println("4. Americano");
        System.out.print("Enter your choice (1-4): ");
        int coffeeChoice = scanner.nextInt();
        scanner.nextLine();



        Coffee coffee;
        switch (coffeeChoice) {
            case 1:
                coffee = factory.createCoffee("espresso");
                break;
            case 2:
                coffee = factory.createCoffee("cappuccino");
                break;
            case 3:
                coffee = factory.createCoffee("latte");
                break;
            case 4:
                coffee = factory.createCoffee("americano");
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        // Step 2: Add toppings
        while (true) {
            System.out.println("\nCurrent Order: " + coffee.getDescription() + " - $" + coffee.getCost());
            System.out.println("Add a topping:");
            System.out.println("1. Milk");
            System.out.println("2. Caramel Syrup");
            System.out.println("3. Whipped Cream");
            System.out.println("4. Chocolate Syrup");
            System.out.println("5. Done");
            System.out.print("Enter your choice (1-5): ");
            int toppingChoice = scanner.nextInt();
            scanner.nextLine();

            switch (toppingChoice) {
                case 1:
                    coffee = new MilkDecorator(coffee);
                    break;
                case 2:
                    coffee = new CaramelSyrupDecorator(coffee);
                    break;
                case 3:
                    coffee = new WhippedCreamDecorator(coffee);
                    break;
                case 4:
                    coffee = new ChocolateSyrupDecorator(coffee);
                    break;
                case 5:
                    System.out.println("\nFinal Order: " + coffee.getDescription() + " - $" + coffee.getCost());
                    System.out.println("Thank you for your order!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}