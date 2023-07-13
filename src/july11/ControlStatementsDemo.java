package july11;

import java.util.Scanner;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        // print naturals numbers with a limit added by user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your limit");
        int limit = scanner.nextInt();

        int counter = 1;
        do {
            System.out.println(counter);
            counter++;
        } while (counter < limit);

    }
}
        /*int counter = 0;
        while(counter < 10){
            System.out.println(counter);
            counter++;
        }*/