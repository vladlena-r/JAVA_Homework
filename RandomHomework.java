package Homework;

import java.util.Random;

public class RandomHomework {
    public static void main(String[] args) {
        Random random = new Random();


        int number = random.nextInt(100) + 200;


        System.out.println("Random number: " + number);
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        System.out.println("Largest digit: " + largestDigit);
    }
}
