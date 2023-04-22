package Homework20_04;

import java.util.Random;

import static Homework20_04.Project1.StringRandom.*;
//Напишите аналог Random для генерации строк - StringRandom. В классе реализуйте набор публичных статических методов:
// первый метод генерирует слово заданной длины, состоящее из  английских букв (любой набор букв).
// Второй метод генерирует предложение из заданного количества разных слов.
// Третий метод генерирует текст из заданного количества разных предложений, разделяя предложения случайными знаками препинания из набора (. или ! или ? или …).
// В методе main сгенерируйте текст из 1000 предложений.
public class Project1 {
    public static void main(String[] args) {
        String text = RandomText(1000);
        String sentence = RandomSentence(10);
        String randomWord = RandomWord(5);
        System.out.println(text);
        System.out.println(sentence);
        System.out.println(randomWord);
    }

    public class StringRandom {
        public static final Random random = new Random();
        public static final String Letters = "ABCDEFG";
        public static final String[] Punctions = {".", "!", "?", "..."};

        public static String RandomWord(int length) {
            StringBuilder a = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                a.append(Letters.charAt(random.nextInt(Letters.length())));
            }
            return a.toString();
        }

        public static String RandomSentence(int wordCount) {
            StringBuilder a = new StringBuilder();
            for (int i = 0; i < wordCount; i++) {
                a.append(RandomWord(random.nextInt(10) + 1)).append(" ");
            }
            a.setCharAt(0, Character.toUpperCase(a.charAt(0)));
            a.deleteCharAt(a.length() - 1).append(". ");
            return a.toString();
        }

        public static String RandomText(int sentenceCount) {
            StringBuilder a = new StringBuilder();
            for (int i = 0; i < sentenceCount; i++) {
                a.append(RandomSentence(random.nextInt(5) + 1));
            }
            a.setCharAt(0, Character.toUpperCase(a.charAt(0)));
            int lastPunctuationIndex = a.length() - 1;
            char lastChar = a.charAt(lastPunctuationIndex);
            if (lastChar != '.' && lastChar != '!' && lastChar != '?') {
                a.append(Punctions[random.nextInt(Punctions.length)]);
            }
            return a.toString();
        }
    }
}
//The *append* method is mainly used to append or add data in a file.
// Can add characters, Booleans, string, integer, float, etc., to the data in a program.