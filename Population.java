package Homework;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a population: ");
        int population = scanner.nextInt();

        System.out.print("Enter an country identifier: ");
        String countryId = scanner.next();

        if (countryId.equals("Germany")) {
            if (population > 0 && population < 100_000)
                System.out.println("This city is small town in Germany");
            else if (population >= 100_000 && population < 400_000)
                System.out.println("This city is middle town in Germany");
            else if (population >= 400_000 && population < 1_000_000)
                System.out.println("This city in Germany with undefined parameter");
            else if (population >= 1_000_000)
                System.out.println("This city is big town in Germany");
            else
                System.out.println("Wrong information about population");

        } else if (countryId.equals("France")) {

            if (population > 0 && population < 200_000)
                System.out.println("This city is small town in France");
            else if (population >= 200_000 && population < 500_000)
                System.out.println("This city is middle town in France");
            else if (population >= 400_000 && population < 1_000_000)
                System.out.println("This city in France with undefined parameter");
            else if (population >= 1_500_000)
                System.out.println("This city is big town in France");
            else
                System.out.println("Wrong information about population");
        } else {
            System.out.println("Wrong country id");
        }
        scanner.close();
    }
}
