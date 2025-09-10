package synchronize.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockEx {
    private static int count = 0;
    private static final ReadWriteLock lock = new ReentrantReadWriteLock();
    private static final Lock readLock = lock.readLock();
    private static final Lock writeLock = lock.writeLock();

    public static void increament() {
        writeLock.lock();
        try {
            count++;
        } finally {
            writeLock.unlock();
        }

    }

    public static int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    increament();
                    System.out.println(Thread.currentThread().getName() + " write");
                }

            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    System.out.println(Thread.currentThread().getName() + " read : "+getCount());
                }
            }
        };

        Thread writeThread = new Thread(runnable,"writeThread");
        Thread readThread = new Thread(runnable1,"readThread");
        Thread reatThread1 = new Thread(runnable1,"reatThread1");

        writeThread.start();
        readThread.start();
        reatThread1.start();

        writeThread.join();
        readThread.join();
        reatThread1.join();
        System.out.println("final count : "+getCount()
        );

    }
}
