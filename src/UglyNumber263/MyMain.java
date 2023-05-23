package UglyNumber263;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.isUgly(6));
        System.out.println(main.isUgly(14));
    }

    public boolean isUgly(int n) {
        boolean result = false;
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        if (n == 1) {
            result = true;
        }
        return result;
    }
}
