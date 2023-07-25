package july22.arrays;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {


        // data type   ref    =   // object
       // int             num[] =  {10, 20, 30 , 40 , 50, 60, 70};
        int x;  // declaration
        x = 10; // init

        int num[] = new int[5];

  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your values for the array");
*/
        num[0] = 10;
        num[1] = 11;
        num[2] = 12;
        num[3] = 33;
        num[4] = 14;


        /*for (int i = 0; i < 5 ; i++) {
            System.out.println(num[i]);
        }*/

       /* for (// type something  :    array ) {

        // print that something
        }*/

        for (int n : num) {
            System.out.println(n);
        }









    }
}
