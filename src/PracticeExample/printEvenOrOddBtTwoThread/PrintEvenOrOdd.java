package PracticeExample.printEvenOrOddBtTwoThread;

import PracticeExample.printEvenOrOddBtTwoThread.EvenNumber;
import PracticeExample.printEvenOrOddBtTwoThread.OddNumber;

public class PrintEvenOrOdd {
    public static void main(String[] args) {
        OddNumber oddNumber = new OddNumber();
        EvenNumber evenNumber = new EvenNumber();

        Thread t1 = new Thread(oddNumber,"t1");
        Thread t2 = new Thread(evenNumber,"t2");
        t1.start();
        t2.start();
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            Thread.interrupted();
            throw new RuntimeException(e);
        }
    }
}
