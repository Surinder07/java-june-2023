package aug31.thread;

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyRunnable3(), "Thread 1 ");
        Thread thread2 = new Thread(new MyRunnable3(), "Thread 2 ");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}

class MyRunnable3 implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "with priority " +
                    Thread.currentThread().getPriority() + "  is counting "  + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
