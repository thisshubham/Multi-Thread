package synchronize.deadlock;

public class Paper {
    public synchronized void writewithPaperAndPan(Pen pen){
        Pen penobj = new Pen();
        System.out.println(Thread.currentThread().getName() + " is using [paper]"+ this + "and trying to write"+pen);
        penobj.finishwork();
    }

    public synchronized void finishwork() {
        System.out.println(Thread.currentThread().getName() + " finished using paper "+this);

    }
}
