package synchronize.lock;

public class MyLock {


    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            BankAccount bankAccount = new BankAccount();
            LocksExample lock = new LocksExample();
            @Override
            public void run() {
//                bankAccount.withdrow(50);
                lock.withdrew(50);
            }
        };


        Thread t1 = new Thread(runnable, "t1");
        Thread t2 = new Thread(runnable, "t2");
        t1.start();
        t2.start();
    }
}
