package synchronize.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockEx {
    private final Lock lock = new ReentrantLock(true);

    public void getResource() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " Thread acquiring the lock ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " Thread interrupt ");
            Thread.interrupted();
        } finally {
            System.out.println(Thread.currentThread().getName() + " Thread release  the lock ");
            lock.unlock();
        }

    }


    public static void main(String[] args) {
        FairnessLockEx fairnessLockEx = new FairnessLockEx();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                fairnessLockEx.getResource();
            }
        };
        Thread t1 = new Thread(runnable,"Thread-1");
        Thread t2 = new Thread(runnable,"Thread-2");
        Thread t3 = new Thread(runnable,"Thread-3");
        t1.start();
        t2.start();
        t3.start();

    }
}
