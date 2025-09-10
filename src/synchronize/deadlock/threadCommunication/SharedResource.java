package synchronize.deadlock.threadCommunication;

public class SharedResource {
    private int data ;
    private boolean hashData;

    public SharedResource(int data, boolean hashData) {
        this.data = data;
        this.hashData = hashData;
    }

    public SharedResource() {

    }

    public synchronized void produceData(int value){
        while (hashData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            data = value;
            hashData = true;
            notify();

        }
    }
    public synchronized int consumeData(){
        while (!hashData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hashData=false;
            notify();
            System.out.println("data consume");
            return data;
        }
        return 0;
    }
}
