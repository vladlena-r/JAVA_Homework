package Homework;

import java.util.Scanner;
public class Pizza {

    public static void main(String[] args) {

        Scanner pizza = new Scanner(System.in);
        System.out.println("Enter pls radius:");
        double radius = pizza.nextDouble();
        double result = Math.pow(radius,30) * Math.PI;
        System.out.println("Radius = " + result);

        pizza.close();
} }





