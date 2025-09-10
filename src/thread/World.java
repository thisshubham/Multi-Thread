package thread;

public class World extends Thread{
    @Override
    public void run(){

        for(; ;){
            System.out.println("Thread name : "+Thread.currentThread().getName());
        }
    }
}
