package runnable;

public class main {
    public static void main(String[] args) {
        RunnableInterface runnableInterface = new RunnableInterface();  // NEW Thread Object Create

        Thread thread = new Thread(runnableInterface);
//        thread.getState() check state of thread
        thread.start(); // Runnable State it will execute any time ready to execute ;
        System.out.println("Execution complete "); // Block/Waiting

    }
}
