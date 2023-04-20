package PowerOfTwo231;

public class MyMain {

    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.isPowerOfTwo(1));
        System.out.println(main.isPowerOfTwo(16));
        System.out.println(main.isPowerOfTwo(3));
    }
    public boolean isPowerOfTwo(int n) {
//        Math.sqrt(n);
//        return true;
        return n > 0 && (n & n - 1) == 0;
    }
}
