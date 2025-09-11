package ThreadPool.latch;

import java.util.concurrent.CountDownLatch;

public class CountDownExample implements Runnable {
    private CountDownLatch countDownLatch;

    @Override
    public void run() {
        System.out.println("count down start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    CountDownExample(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
}
