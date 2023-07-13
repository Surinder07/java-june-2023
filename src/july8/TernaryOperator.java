package july8;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        // check if this number if even or odd
      /*  int number = 10;
        if(number %2 ==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number id odd");
        }
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check even/odd");
        int number = scanner.nextInt();

      /*  String result = (number %2 ==0) ? "even": "odd";
        System.out.println(result);*/

        int  integerResult = (number %2 ==0) ? 10: 20;
        System.out.println(integerResult);
    }
}
