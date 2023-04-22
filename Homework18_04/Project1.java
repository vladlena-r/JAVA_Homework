package Homework18_04;

import java.util.Arrays;

public class Project1 {
    //1 Создайте двумерный массив и заполните его буквами русского алфавита.
    public static void main(String[] args) {
        char[][] alphabet = new char[33][1];
        char A = 'А';
        char Z = 'Я';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i][0] = A;
            A++;
            if (A > Z) {
                break;
            }
        }
        alphabet[32][0] = 'Ё';
        for (int i = 0; i < alphabet[i].length; i++) {
            System.out.print(Arrays.deepToString(alphabet));
        }
    }
}



