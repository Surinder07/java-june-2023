package july15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        CalculatorDemo.sum(num1, num2);

        CalculatorDemo.sum(num1, num2, 0);


        // System.out.println(MethodParamArgs.sum(10, 12));

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the company");
        String name = scanner.next();
        TestSolution.enterInformation(name);


        System.out.println("Enter the age of the company");
        int age = scanner.nextInt();
        TestSolution.enterInformation(age);  // argument
*/

    }
}
