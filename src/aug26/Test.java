package aug26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*

        double x = 10;
        float y = (int)x;
*/
        Mobile mobile = new Mobile() {
            @Override
            public void call() {
                System.out.println("calling... ");
            }
        };
        mobile.call();

        // lambda

        Mobile mobile1 = () -> System.out.println("calling... ");

        mobile1.call();

        System.out.println(mobile1);


    }
}
/*

Collections -->
  Interfaces --> List   --  Set   --  queue       Map


 */
