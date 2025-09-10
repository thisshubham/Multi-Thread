package synchronize.deadlock.threadCommunication;

public class ThreadCommunication {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Consumer consumer = new Consumer(sharedResource);
        Producer producer = new Producer(sharedResource);
        Thread t1 = new Thread(consumer,"t1");
        Thread t2 = new Thread(producer,"t2");

        t1.start();
        t2.start();

    }
}
