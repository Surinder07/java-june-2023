package july11;

import java.util.Scanner;

public class IterationDemo {
    public static void main(String[] args) {
   // break    continue
          // break  will break the for loop
        // continue -- skip the current iteration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number ;

        for (int i = 1;  i <= 10 ; i++) {
            number = scanner.nextInt();
            if(number <0){
                break;
            }
        }
        System.out.println("sorry you voilated the policy ");
    }
}


