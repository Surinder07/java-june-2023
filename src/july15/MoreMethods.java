package july15;

public class MoreMethods {
    // method overloading
    // methods with same name and different parameters
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int sum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void enterInput(String name){

    }

    public static void enterInput(int age){

    }



}
//Problem 1:
//  create an overloaded method which takes input of number,
//  String and float etc
// and whenever user call with respective input.
// It should print the message based on the input
// example : Input

// Test case 1 : Enter your value : 23
// your age is 23
//
// if user enter name
//Test case 2 : Enter your value : "Surinder"
// print your name is Surinder
// same way print salary etc

