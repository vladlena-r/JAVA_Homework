package Homework;

public class CreateBox {

   public int height;
    public int length;
    public int width;

    public int volume;

    public CreateBox(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
        int volume = height * length * width;
        System.out.println(volume);
    }

    public CreateBox(int height, int length) {
        this.height = height;
        this.length = length;
        width = 30;
        int volume = height * length * width;
        System.out.println(volume);
    }

    public CreateBox(int width) {

        height = 49;
        length = 40;
        this.width = width;
        int volume = height * length * width;
        System.out.println(volume);
    }

    public CreateBox() {
        height = 49;
        length = 40;
        width = 30;
        int volume = height * length * width;
        System.out.println(volume);
    }



}
