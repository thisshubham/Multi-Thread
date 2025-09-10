package synchronize.deadlock.threadCommunication;

public class Producer implements Runnable {
    private SharedResource sharedResource;
    public Producer(SharedResource sharedResource) {
        this.sharedResource=sharedResource;

    }

    @Override
    public void run() {
        SharedResource sharedResource = new SharedResource();
        for (int i = 0; i<10; i++){
            sharedResource.produceData(i);
        }
    }
}
