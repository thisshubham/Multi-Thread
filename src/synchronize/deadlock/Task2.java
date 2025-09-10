package synchronize.deadlock;

public class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        Paper paper1 = new Paper();
        paper1.writewithPaperAndPan(pen);

    }
}
