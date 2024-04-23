package multithreading;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

//    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new CustomThread();
//        thread.run();
//        thread.start();
//        Thread.sleep(1000);
//        thread.run();
//        thread.start();
//    }

    public static void print() {
        int i = 5;
        System.out.println(i);
        i += 10;
        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> print());
        Thread t2 = new Thread(() -> print());

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
