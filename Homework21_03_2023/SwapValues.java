package Homework21_03_2023;

public class SwapValues {
    public static void main(String[] args) {
        int a = 30;
        int b = 55;
        int c = a;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
        a = b;
        b = c;
        System.out.println();
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }
}

