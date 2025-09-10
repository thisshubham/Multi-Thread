package synchronize.deadlock;

public class DeadLockEx {


    public static void main(String[] args) {
        Paper paper = new Paper();
        Pen pen = new Pen();
        Thread t1 = new Thread(new Task1(pen,paper),"t1" );
        Thread t2 = new Thread(new Task2(pen,paper),"t2" );

        t1.start();
        t2.start();

//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}
