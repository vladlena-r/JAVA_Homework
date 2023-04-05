package Homework;

import java.util.Scanner;

public class ElevatorDemo {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the building: ");
    int h = input.nextInt();

        System.out.print("Enter the number of floors the elevator goes up: ");
    int n = input.nextInt();

        System.out.print("Enter the number of floors the elevator goes down: ");
    int m = input.nextInt();

    int lifts = calculateLifts(h, n, m);
        System.out.println("The elevator will need " + lifts + " lifts to reach the top floor.");
}

    public static int calculateLifts(int h, int n, int m) {
        int lifts = (h - m) / (n - m);
        if ((h - m) % (n - m) != 0) {
            lifts++;
        }
        return lifts;
    }
}
