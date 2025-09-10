package synchronize.deadlock;

public class Pen {
    public synchronized void writewithPenAndPaper(Paper paper) throws InterruptedException {
        Paper penPaper1 = new Paper();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is using pen"+ this + " and trying to write");
        penPaper1.finishwork();
    }

    public synchronized void finishwork() {
        System.out.println(Thread.currentThread().getName() + " finished using pen "+this);

    }
}
