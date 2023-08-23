package aug22;

public class Test {

    public static void main(String[] args) {

        try{
          int x = 10;
          int y = x/0;
            System.out.println("Hello");
            System.exit(0);
        }
        finally {
            System.exit(0); // interview question
            System.out.println("finally block");
        }

    }
    /*
     Exception handling
     -- try catch finally
     throw - when we explicity throw an exception
     and
     throws -- we throw exception for other method to handle

     File handling  --

     Enums

     final ---->  class , you can not extend
      method -- > it can not be overriden
      variable  -- > constant

      finally --> in try catch -> when we want that that piece of code should work

      finalize -->


      java 7

     */
}
