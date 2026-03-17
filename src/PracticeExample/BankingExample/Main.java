package PracticeExample.BankingExample;

public class Main {
    public static void main(String[] args) {
        Deposit deposit = new Deposit();
        WithDrew withDrew = new WithDrew();
        Thread t1 = new Thread(deposit,"");
        Thread t2 = new Thread(withDrew,"t2");

        t1.start();
        t2.start();

    }
}
