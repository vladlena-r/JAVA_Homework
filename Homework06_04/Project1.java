package Homework06_04;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your house: ");
        int n = scanner.nextInt();

        int[] array = new int[n * 10 + 1];

        for (int i = 0; i <= n * 10; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Finish");
    }
}
