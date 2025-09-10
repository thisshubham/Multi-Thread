package synchronize.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTrentLockExample {
    private  final Lock lock = new ReentrantLock();
    public void outermethod(){
        try {
            lock.lock();
            System.out.println("outer method:!");
            innermethod();
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    private void innermethod() {
        try {
            lock.lock();
            System.out.println("inner method:!");
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReenTrentLockExample trentLockExample = new ReenTrentLockExample();
        trentLockExample.outermethod();

    }
}
