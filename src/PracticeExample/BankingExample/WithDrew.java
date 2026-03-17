package PracticeExample.BankingExample;

public class WithDrew implements Runnable {
    private BankAccount bankAccount;

    @Override
    public void run() {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.withdrew(200.0);
    }
}
