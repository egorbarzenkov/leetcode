package FibonacciNumber509;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.fib(2));
        System.out.println(myMain.fib(3));
        System.out.println(myMain.fib(4));
    }

    public int fib(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return fib(n-2) + fib(n-1);
    }
}
