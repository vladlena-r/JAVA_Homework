package Homework22_03_2023;

import java.util.Random;

public class WorkHoursApp {
        public static void main(String[] args) {

            WorkHoursApp seconds = new WorkHoursApp();
            Random random = new Random();
            int n = random.nextInt(0, 28800);
            System.out.println("Time in seconds: " + n);

            int a = (int) (seconds.convertHours(n));
            System.out.println("Time in hours: " + a);

        }

        public double convertHours(double n) {
            double b = n / 2800;
            return b;
        }
    }
