package PracticeExample.printEvenOrOddBtTwoThread;

public class EvenNumber implements Runnable {
    @Override
    public void run() {
        checkEvenNumber(30);
    }

    public void checkEvenNumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("Thread name : "+Thread.currentThread().getName()+ " Even number : "+i);
            }
        }
    }
}
