public class Homework09_03_2023 {
    public static void main(String[] args) {
        //DECIMAL

        int a = 1144;
        System.out.println(1*Math.pow(10,3) + 1*Math.pow(10,2) + 4*Math.pow(10,1) + 4*Math.pow(10,0));

        int b = 978;
        System.out.println(9*Math.pow(10,2) + 7*Math.pow(10,1) + 8*Math.pow(10,0));

        int c = 12;
        System.out.println(1*Math.pow(10,1) + 2*Math.pow(10,0));

        System.out.println();

        //OCTAL 10->8

        int d = 1144;
        int d8 = 02170;
        System.out.println(d8);
        System.out.println(2*Math.pow(8,3) + 1*Math.pow(8,2)
        + 7*Math.pow(8,1) + 0*Math.pow(8,0));

        System.out.println(1144 / 8);       //143
        System.out.println(1144 % 8);       //0

        System.out.println(143 / 8);        //17
        System.out.println(143 % 8 );       //7

        System.out.println(17 / 8);     //2
        System.out.println(17 % 8);     //1

        System.out.println(2 / 8);      //0
        System.out.println(2 % 8);      //2

        //2170

        System.out.println();

        int e = 978;
        int e8 = 01722;
        System.out.println(e8);
        System.out.println(1*Math.pow(8,3) + 7*Math.pow(8,2) + 2*Math.pow(8,1) + 2*Math.pow(8,0));

        System.out.println(978 / 8);        //122
        System.out.println(978 % 8);        //2

        System.out.println(122 / 8);        //15
        System.out.println(122 % 8);        //2

        System.out.println(15 / 8);     //1
        System.out.println(15 % 8);     //7

        System.out.println(1 / 8);      //0
        System.out.println(1 % 8);      //1

        //1722

        System.out.println();

        int f = 12;
        int f8 = 014;
        System.out.println(f8);
        System.out.println(1*Math.pow(8,1) + 4*Math.pow(8,0));

        System.out.println(12 / 8);     //1
        System.out.println(12 % 8);     //4

        System.out.println(1 / 8);      //0
        System.out.println(1 % 8);      //1

        //14
    }
}
