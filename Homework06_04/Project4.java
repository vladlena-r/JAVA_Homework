package Homework06_04;

import java.util.Scanner;
public class Project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int count = words.length;

        System.out.println("Number of words: " + count);

        System.out.println("Words longer than two characters is:");
        for (String word : words) {
            if (word.length() > 2) {
                System.out.println(word);
            }
        }
    }
}
