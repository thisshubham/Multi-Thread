package ThreadPool;

import synchronize.deadlock.threadCommunication.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CollableFutureEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        getCollableCollection();


    }

    public static void getCollableCollection() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Integer> c1 = () -> {
            System.out.println("c1 is ");
            return 1;
        };
        Callable<Integer> c2 = () -> {
            System.out.println("c2 is ");
            return 2;
        };
        Callable<Integer> c3 = () -> {
            System.out.println("c3 is ");
            return 3;
        };
        List<Callable<Integer>> callables = Arrays.asList(c1, c2, c3);
        try {
            List<Future<Integer>> futures = executorService.invokeAll(callables);
            for (Future<Integer> f : futures) {
                System.out.println("future is : " + f.get());
            }
            executorService.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFuturrEx(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future  = executorService.submit(() -> "hello"); // it allow to return and throw exception
        try {
            System.out.println(future.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        if(future.isDone()){
            System.out.println("program execution done : ");
            future.cancel(future.isDone());
            executorService.shutdown();

        }
    }
}
