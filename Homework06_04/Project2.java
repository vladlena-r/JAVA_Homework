package Homework06_04;

import java.util.Random;

public class Project2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

//Чего-то не хватает, не могу понять что ...
        int maxReference = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i]) % 5 > (maxReference) % 5) {
                maxReference = a[i];
            }
        }
        System.out.println("Maximum number is: " + maxReference);
    }
}
