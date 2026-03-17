package PracticeExample.printEvenOrOddBtTwoThread;

public class OddNumber implements Runnable {


    @Override
    public void run() {
        checkOddNumber(30);
    }

    private void checkOddNumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println("Thread name : "+Thread.currentThread().getName()+ " Odd number : "+i);
            }
        }
    }

}
