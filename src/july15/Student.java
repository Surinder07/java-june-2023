package july15;

import java.util.UUID;

public class Student {
    // properties
    // member variables
    String firstName = "Mike";
    int age = 22;
    double marks = 40;
    int id = 101;

    public void sum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }

    // behaviours
    public void writing(){
        System.out.println("Student is writing ");
    }

    public void laziness(){
        System.out.println("this student is very lazy");
    }

    public void study(){
        System.out.println("student is studying");
    }







}
