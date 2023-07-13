package july8;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        System.out.println("welcome to my House" );
        System.out.println("1. Bulb");
        System.out.println("2. red bulb");
        System.out.println("3. fan");
        System.out.println("4. Nothing");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        //int input = scanner.nextInt();
        String name  = scanner.next();
        // String s
        switch(name){
            case "Pragra" :
                System.out.println("Switch on the white bulb");
                break;
            case "Toronto" :
                System.out.println("switch on the red bulb");
                break;
            /*case 3:
                System.out.println("switch on the fan");
                break;
            case 4:
                System.out.println("switch on nothing....");
                break;*/
            default:
                System.out.println("Wrong input");

        }

    }
}

// Problem statement
// create calculator with switch case
// 1. addition, 2. sub ..... default
// 2. same  customer care application program :
//
// Address input
// use input as String :    1. pragra ---> address of pragra
// 2. CN Tower --> address of cn tower
// 3. aquarium   ->> address of aquarium

// try charter input calculator...

