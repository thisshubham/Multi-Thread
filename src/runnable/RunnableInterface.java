package runnable;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
                    // Running State thread is running
        for (; ; ){
            System.out.println("Hello world !");
            System.out.println("(Runnable thread name : "+ Thread.currentThread().getName());
                // Terminated
        }
    }
}
