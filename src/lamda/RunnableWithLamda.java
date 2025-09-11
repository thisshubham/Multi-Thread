package lamda;

public class RunnableWithLamda {


    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i =0; i<10;i++){
                System.out.println("iteration time : "+i);

            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }

}
