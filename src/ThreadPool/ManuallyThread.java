package ThreadPool;

public class ManuallyThread {

    public static long getFactorial(int n) {
        long starttime = System.currentTimeMillis();
        long result = 1;
        try {
            Thread.sleep(1000);
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println("time taken by thread : " + Thread.currentThread().getName() + " take time : " + (System.currentTimeMillis() - starttime));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    public static void main(String[] args) {
//        int  num = 5;

//        Manually create thread for each task

        Thread[] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            threads[i - 1] = new Thread(() -> {
                System.out.println("Factorial of " + finalI + " is " + getFactorial(finalI));
            });
            threads[i - 1].start();
        }
    }
}
