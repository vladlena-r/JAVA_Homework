package Homework05_04;
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the current month: ");
        String currentMonth = scanner.nextLine().toLowerCase();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Other months:");
        for (String month : months) {
            if (!month.equals(currentMonth)) {
                System.out.println(month);
            }
        }
    }
}
