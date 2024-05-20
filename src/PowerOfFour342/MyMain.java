package PowerOfFour342;

public class MyMain {

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(myMain.isPowerOfFour(16));
        System.out.println(myMain.isPowerOfFour(5));
//        System.out.println(myMain.isPowerOfFour(1));
//        System.out.println(myMain.isPowerOfFour(2));
    }

    public boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }

}
