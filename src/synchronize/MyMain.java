package synchronize;

public class MyMain extends Thread {
    private Counter counter;
    @Override
    public void run() {
        for (int i=0; i<1000 ; i++){
            counter.increament();
        }


    }
    public MyMain(Counter counter){
        this.counter=counter;
    }
    public static void main(String[] args) {
    Counter counter1 = new Counter();
        MyMain t1 = new MyMain(counter1);
        MyMain t2 = new MyMain(counter1);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println(counter1.getCount());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
