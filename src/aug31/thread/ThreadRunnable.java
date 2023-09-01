package aug31.thread;

public class ThreadRunnable {
    public static void main(String[] args) {


        Thread thread = new Thread(() -> System.out.println("thread is running "));
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.print( "  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}