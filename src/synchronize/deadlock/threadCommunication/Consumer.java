package synchronize.deadlock.threadCommunication;

public class Consumer implements Runnable{
    private SharedResource sharedResource;
    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public Consumer() {

    }

    @Override
    public void run() {
        SharedResource sharedResource = new SharedResource();
        for (int i =0; i<10;i++){
            int value = sharedResource.consumeData();
            System.out.println("Consumed : "+ value);
        }
    }
}
