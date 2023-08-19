package Aug19;

public class ExceptionT {


    public void setName(){

        try {

            // arithmetic divide by zero
            // Array index out of bound exception
            // Null pointer exception

        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }

    public void callThreadSleep() throws InterruptedException {

        Thread.sleep(1000); // sleep for 1 sec
    }

    public static void main(String[] args) {

       ExceptionT obj = new ExceptionT();
       obj.setName();

    }


}
