package PracticeExample.BankingExample;

public class Deposit implements Runnable{
    private BankAccount bankAccount;
    @Override
    public void run() {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.depositAmount(100.0);
    }

}
