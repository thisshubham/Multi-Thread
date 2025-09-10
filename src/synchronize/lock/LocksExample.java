package synchronize.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksExample {
    private final Lock lock = new ReentrantLock();
    private int balance = 1000;

    public void withdrew(int amount) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                System.out.println("thread name : " + Thread.currentThread().getName() + " Attempting withdrew " + amount);
                if (balance > -amount) {
                    System.out.println("thread name : " + Thread.currentThread().getName() + " proceeding withdrew " + amount);
                    try {
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println("thread name : " + Thread.currentThread().getName() + " Amount Successfully withdrew remaining balancs " +balance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("thread name : " + Thread.currentThread().getName() + " Insufficient balance " + amount);
                }
            } else {
                System.out.println("thread name : " + Thread.currentThread().getName() + " Not available to acquire thread " + amount);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
