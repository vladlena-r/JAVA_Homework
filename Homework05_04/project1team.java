package Homework05_04;

import java.util.Random;
public class project1team {
    public static void main(String[] args) {
        int PC_PRICE = 100000;
        int gift1 = 500;
        int gift2 = 1000;
        int gift3 = 2000;
        int gift4 = 5000;

        Random random = new Random();
        int giftSum = 0;
        int numGifts = 0;

        while (giftSum < PC_PRICE) {
            int gift = 0;
            int bill = (int) (Math.random() * 4);

            switch (bill) {
                case 0:
                    gift = gift1;
                    break;
                case 1:
                    gift = gift2;
                    break;
                case 2:
                    gift = gift3;
                    break;
                case 3:
                    gift = gift4;
                    break;
            }
            giftSum += gift;
            numGifts++;
            System.out.println("Received gift of " + gift + " rubles. \nTotal received: " + giftSum + " rubles.");
    }
}
}