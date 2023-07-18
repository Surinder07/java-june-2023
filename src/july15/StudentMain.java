package july15;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        // Student.show();

        Student student = new Student();
        student.age = 12;
        student.firstName = "Michael";

        System.out.println("age is "+student.age);
        System.out.println(student.firstName);
    }
}

/*
int x; // decalration
        x = 10; // initilization

 */
// student -- object reference
// new --> keyword , gives memory to object
// stack and heap ?
// Student() -- constructor , initializes the object
// Scanner()