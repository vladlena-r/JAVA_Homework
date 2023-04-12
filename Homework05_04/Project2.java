package Homework05_04;

import java.util.Scanner;
public class Project2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int a = scr.nextInt();

        System.out.print("Enter the upper limit: ");
        int b = scr.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers in the range " + a + " to " + b + " is " + sum + ".");
    }
}

