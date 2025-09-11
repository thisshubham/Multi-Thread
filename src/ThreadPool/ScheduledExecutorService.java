package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorService {
    public static void main(String[] args) {
//        getScheduledExecutoerService();
        scheduledTaskEachTime();

    }

    public static void getScheduledExecutoerService() {   // task execute at scheduled time
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("task execution initiating.....");

        scheduledExecutorService.schedule(() -> {
            System.out.println("task executed : ");
        }, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(() -> {
            System.out.println("thread shut down. ");
        }, 20, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

    public static  void scheduledTaskEachTime(){
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            scheduledExecutorService.scheduleAtFixedRate(()->{
                System.out.println("task execute every 5 sec without waiting last task complete or not  : ");
            },5,5,TimeUnit.SECONDS);
            scheduledExecutorService.shutdown();
    }
    public static  void scheduledTaskEachTimeWithDelay(){
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(()->{
            System.out.println("task execute every 5 sec of after  last task completed  : ");
        },5,5,TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }}
