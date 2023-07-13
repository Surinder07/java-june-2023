package july8;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println("welcome to my calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");

        int input = scanner.nextInt();

        char choice;
        if(input == 1){
             do {
                 System.out.println("Enter the first number ");
                 int num1 = scanner.nextInt();

                 System.out.println("Enter the second number ");
                 int num2 = scanner.nextInt();

                 int sum = num1 + num2;
                 System.out.println("sum of " + num1 + " and " + num2 + " is: " + sum);
                 System.out.println("do you still want to continue Y for yes, n for no");
                  choice = scanner.next().charAt(0);

             }while (choice != 'n');

        }
        else if(input == 2){
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the first number ");
            int num2 = scanner.nextInt();

            int sub = num1 - num2;
            System.out.println(sub);
        }
        else if(input ==3){

        }
        else if(input == 4){

        }
        else{
            System.out.println("wrong input");
        }
    }
}
