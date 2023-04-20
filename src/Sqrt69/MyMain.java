package Sqrt69;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.mySqrt(4));
        System.out.println(main.mySqrt(8));
    }

    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
