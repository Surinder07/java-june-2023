package Aug19;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
          //
        String name = "pragra ";
        name = null;
        int x = 10;

        try {
            System.out.println(name.toLowerCase());

            System.out.println("Code at line number 11");

        }catch (NullPointerException e){  // junior dev
            e.printStackTrace();
        }
       finally {
            scanner.close();
            System.out.println("I am in the finally block");
        }

    }
}

// Throwable ---> Exception



        /*
        try{
         // paste the code where we expect exception
        }
        catch(){
          // catch that exception
        }
        */
