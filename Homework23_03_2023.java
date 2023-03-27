package Homework;

import java.util.Scanner;

public class Homework23_03_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature of first balloon: ");
        int temp1 = scanner.nextInt();

        System.out.print("Enter the temperature of second balloon: ");
        int temp2 = scanner.nextInt();
        scanner.close();

        if (temp1 >= 100 && temp2 <= 100) {
            System.out.println("Device work");
        } else {
            System.out.println("Device does not work");
        }
    }
}
