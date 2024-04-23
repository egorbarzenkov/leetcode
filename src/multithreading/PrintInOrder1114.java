package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintInOrder1114 {
}

class Foo {

    public Foo() {

    }

    AtomicInteger count = new AtomicInteger();

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            count.incrementAndGet();
            printFirst.run();
            notifyAll();
        }

    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            while (count.get() < 1) {
                wait();
            }
            count.incrementAndGet();
            printSecond.run();
            notifyAll();
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (this) {
            while (count.get() < 2) {
                wait();
            }
            count.incrementAndGet();
            printThird.run();
            notifyAll();
        }
    }
}