package aug31.thread;
//extending thread class
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.print( "  " + i);
            // Thread.sleep(5000)
        }
    }
    public static void main(String[] args) {

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        for (int j = 0; j <10 ; j++) {
            System.out.print( " "+j);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



// How to create thread?
// 1.extend a thread class
// 2. implement Runnable interface