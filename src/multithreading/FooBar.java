package multithreading;


import java.util.concurrent.atomic.AtomicBoolean;

class FooBar {
//    private int n;
//    private AtomicBoolean fooFlag;
//
//    public FooBar(int n) {
//        this.n = n;
//        fooFlag = new AtomicBoolean(true);
//    }
//
//    public void foo(Runnable printFoo) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            while(!fooFlag.get()) {
//
//            }
//            // printFoo.run() outputs "foo". Do not change or remove this line.
//            printFoo.run();
//            fooFlag.set(false);
//        }
//    }
//
//    public void bar(Runnable printBar) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            while(fooFlag.get()) {
//
//            }
//            // printBar.run() outputs "bar". Do not change or remove this line.
//            printBar.run();
//            fooFlag.set(true);
//        }
//    }

    private int n;
    private boolean flag;

    public FooBar(int n) {
        this.n = n;
        this.flag = true;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if(!flag) {
                wait();
            }
            printFoo.run();
            flag = false;

            notifyAll();

            // printFoo.run() outputs "foo". Do not change or remove this line.

        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            if(flag) {
                wait();
            }
            printBar.run();
            flag = true;
            notifyAll();
        }
    }
}