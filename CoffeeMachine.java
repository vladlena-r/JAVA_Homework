package Homework;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a drink: 1. Espresso 2. Americano 3. Cappuccino 4. Water ");
        int selection = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
        }
        selection = scanner.nextInt();

        scanner.close();

        makeDrinkUsingIfElse(selection);
        makeDrinkUsingSwitch(selection);
    }

    // if-else
    public static void makeDrinkUsingIfElse(int selection) {
        if (selection == 1) {
            System.out.println("Your espresso is ready!");
        } else if (selection == 2) {
            System.out.println("Your americano is ready!");
        } else if (selection == 3) {
            System.out.println("Your cappuccino is ready!");
        } else if (selection == 4) {
            System.out.println("Your water is ready!");
        } else {
            System.out.println("Invalid selection. Please try again.");
        }
    }

    public static void makeDrinkUsingSwitch(int selection) {
        switch (selection) {
            case 1:
                System.out.println("Your espresso is ready!");
                break;
            case 2:
                System.out.println("Your americano is ready!");
                break;
            case 3:
                System.out.println("Your cappuccino is ready!");
                break;
            case 4:
                System.out.println("Your water is ready!");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }

    }
}


