package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorEx {
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
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            Future<?>  future =executorService.submit(() -> {
                getFactorial(finalI);
            });
        }
        executorService.shutdown();
    }
}
