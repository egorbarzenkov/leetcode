package multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class FizzBuzzMultithreaded {
}
class FizzBuzz {
    private int n;
    private Lock lock;
    private Condition condition;
    private int i;

    public FizzBuzz(int n) {
        this.n = n;
        lock = new ReentrantLock();
        condition = lock.newCondition();
        i = 1;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        lock.lock();
        try{
            while(i<=n){
                if(i%3==0 && i%5!=0){
                    // CS
                    printFizz.run();
                    i++;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        lock.lock();
        try{
            while(i<=n){
                if(i%3!=0 && i%5==0){
                    // CS
                    printBuzz.run();
                    i++;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        lock.lock();
        try{
            while(i<=n){
                if(i%3==0 && i%5==0){
                    // CS
                    printFizzBuzz.run();
                    i++;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        try{
            while(i<=n){
                if(i%3!=0 && i%5!=0){
                    // CS
                    printNumber.accept(i);
                    i++;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
