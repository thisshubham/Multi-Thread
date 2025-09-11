package ThreadPool.comparablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


public class ComparetableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            printPyramid(5);

            return "null";
        });
        String s = null;
        try {
            s = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s);
    }


    public static void printPyramid(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i+i; j++) {
                System.out.println("*");
            }
        }
    }
}
