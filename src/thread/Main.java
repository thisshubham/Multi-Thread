package thread;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.start();
       for (; ;){
        System.out.println("Hello world!");
        System.out.println("Thread name : "+Thread.currentThread().getName());
    }
    }
}