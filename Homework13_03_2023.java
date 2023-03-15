package Homework;

import java.util.Scanner;

public class Homework13_03_2023 {
    public static void main(String[] args) {

//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter pls a integer number:");
//
//        int a = Sc.nextInt();
//
//        int tmp1= a / 3;
//        int tmp1_ = a % 3;
//
//        int tmp2 = tmp1 / 3;
//        int tmp2_ = tmp1 % 3 ;
//
//        int tmp3 = tmp2 / 3;
//        int tmp3_ = tmp2 % 3;
//
//        System.out.println(tmp3_ + "" + tmp2_ + "" + tmp1_);
//
//        Sc.close();

        System.out.println();

        Scanner DE = new Scanner(System.in);
        System.out.println("Enter pls a number (3 value):");
        // 166

        int a = DE.nextInt();

        int tmp1 = a / 3;
        int tmp1_ = a % 3;

        System.out.println(a / 3);    //55
        System.out.println(a % 3);    //1

        int tmp2 = tmp1 / 3;
        int tmp2_= tmp1_ % 3;

        System.out.println(tmp1 / 3);      //18
        System.out.println(tmp1 % 3);      //1
//
        int tmp3 = tmp2 / 3;
        int tmp3_= tmp2_ % 3;

        System.out.println(tmp2 / 3);      //6
        System.out.println(tmp2_ % 3);     //1

        int tmp4 = tmp3 / 3;
        int tmp4_= tmp3_% 3;

        System.out.println(tmp3 / 3);   //2
        System.out.println(tmp3_% 3);   //1

        System.out.println(tmp4_ + "" + tmp3_ + "" + tmp2_ + "" + tmp1_);

        DE.close();




    }
}
