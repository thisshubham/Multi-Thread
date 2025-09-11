package ThreadPool.latch;

import java.util.concurrent.TimeUnit;

public class CountDownLatch {
    private static CountDownExample CountDownLatch;

    public static void main(String[] args) throws InterruptedException {
        int taskSize=4;
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(taskSize);
        for (int i = 1 ; i <=  taskSize ; i++){
            new Thread(new CountDownExample(countDownLatch) ).start();

        }
        countDownLatch.await(5, TimeUnit.SECONDS);
        System.out.println("Main");
    }
}
