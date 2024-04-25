package multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class PrintZeroEvenOdd {
}
class ZeroEvenOdd {
    private int n;
    private AtomicInteger counter;
    private boolean zeroDone;

    public ZeroEvenOdd(int n) {
        this.n = n;
        this.counter = new AtomicInteger(1);
        this.zeroDone = false;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while (counter.get() <= n) {
            synchronized(counter) {
                if (counter.get() > n) {
                    return;
                }
                if (!zeroDone) {
                    printNumber.accept(0);
                    zeroDone = true;
                    counter.notifyAll();
                }
                else {
                    counter.wait();
                }
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while (counter.get() <= n) {
            synchronized(counter) {
                if (counter.get() > n) {
                    return;
                }
                if (zeroDone && counter.get()%2 == 0) {
                    printNumber.accept(counter.get());
                    counter.incrementAndGet();
                    zeroDone = false;
                    counter.notifyAll();
                }
                else {
                    counter.wait();
                }
            }
        }

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (counter.get() <= n) {
            synchronized(counter) {
                if (counter.get() > n) {
                    return;
                }
                if (zeroDone && counter.get()%2 == 1) {
                    printNumber.accept(counter.get());
                    counter.incrementAndGet();
                    zeroDone = false;
                    counter.notifyAll();
                }
                else {
                    counter.wait();
                }
            }
        }
    }
}
