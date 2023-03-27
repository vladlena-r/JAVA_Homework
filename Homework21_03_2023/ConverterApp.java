package Homework21_03_2023;

import java.util.Scanner;

public class ConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter C = new Converter();
        System.out.println("Please enter temperature in Celsius: ");
        double first = scanner.nextDouble();

        C.convertFahrenheit(first);
        System.out.println("Your temperature in Fahrenheit is: " + C.convertFahrenheit(first));

        C.convertKelvin(first);
        System.out.println("Your temperature in Kelvin is: " + C.convertKelvin(first));

        scanner.close();
    }
}

