package Homework06_04;

import java.util.Arrays;
import java.util.Scanner;
public class Project3 {
    //Пользователь вводит строку. Разместите буквы в строке по алфавиту и выведите в консоль.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);

        System.out.println("Sorted Alphabetically: " + sorted);
    }
}
