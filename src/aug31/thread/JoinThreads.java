package aug31.thread;

public class JoinThreads {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyRunnable2("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable2("Thread 2"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();


        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads have finished... ");
    }
}

class MyRunnable2 implements Runnable{

    private String name;

    public MyRunnable2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name  + "started....");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("finished....");
    }
}
