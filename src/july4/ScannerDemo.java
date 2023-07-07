package july4;

import java.util.Scanner;

public class ScannerDemo {
    // main , psvm
    public static void main(String[] args) {
        int  x ;
        int y;
        int sum;
        Scanner scanner = new Scanner(System.in); // created object of scanner class

        System.out.println("Enter the first Number :");
        x = scanner.nextInt();

        System.out.print("Enter the second number :");
        y = scanner.nextInt();

        sum = x + y;

        System.out.print("Sum of x and y : " + sum);
    }
}
