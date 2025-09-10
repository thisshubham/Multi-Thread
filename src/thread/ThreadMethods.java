package thread;

public class ThreadMethods extends Thread{
    @Override
    public void run() {
        try {
            ThreadMethods.sleep(5000);
//            System.out.println(Thread.currentThread().getName());
            System.out.println("thread name : "+ThreadMethods.currentThread().getName() +"- thread priority "+Thread.currentThread().getPriority());
            Thread.yield();  // yeild method is give chance to other thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods threadMethods = new ThreadMethods();
        ThreadMethods t2 = new ThreadMethods();

        threadMethods.start();
//        threadMethods.join();  // main mwthod wait for another thread
        threadMethods.setName("t1");
        threadMethods.setPriority(Thread.MAX_PRIORITY);
        threadMethods.interrupt();    // interrupt the task any like sleep ,
        t2.setDaemon(true);



    }
}
