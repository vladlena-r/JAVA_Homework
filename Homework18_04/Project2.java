package Homework18_04;

public class Project2 {
    //Задание из собеседования Яндекс: дана строка вида AAABBBCCCDDEG…, состоящая только из заглавных символов латинского алфавита.
    // Напишите метод, который «свернёт» строку к виду A4B3C3D2EG, т.е. количество букв записывается цифрой.
    // Если буква одна, то цифра не ставится.

    public static void main(String[] args) {
        String result = StringToNumber("AAABBBCCCDDEG");
        System.out.println(result);
    }
    public static String StringToNumber(String a) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            int count = 1;
            while (i + 1 < a.length() && a.charAt(i + 1) == a.charAt(i)) {
                count++;
                i++;
            }
            result += a.charAt(i) + (count > 1 ? String.valueOf(count) : "");
        }
        return result;
    }
}

