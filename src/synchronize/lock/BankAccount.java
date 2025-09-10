package synchronize.lock;

public class BankAccount extends Thread {
    private int balance = 1000;

    public  synchronized  void withdrow(int amount){
        BankAccount bankAccount = new BankAccount();
        System.out.println("thread name : "+Thread.currentThread().getName()+"attempting withdrew  amount : " +amount);

        if (balance >= amount){
            System.out.println("thread name : "+Thread.currentThread().getName()+" processed withdrew ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println("thread name : "+Thread.currentThread().getName()+" processed Successfully : " +amount);
        }else {
            System.out.println("thread name : "+Thread.currentThread().getName()+" Insufficient balance : " +amount);

        }
    }
}
