package synchronize.deadlock;

public class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;
    @Override
    public void run() {
       Pen pen1 = new Pen();
        try {
            pen1.writewithPenAndPaper(paper);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public Task1(Pen pen,Paper paper) {
        this.pen = pen;
        this.paper=paper;
    }
}
