package july18;

import java.util.Scanner;

public class CalculateArea {
    static double PI = 3.14;
    double radius;

    // const --
    public CalculateArea(double radius) {
        this.radius = radius;
    }
    // method here to calculate area

    public static double calculateArea(double input){

        //double area = PI * radius * radius;
        return PI * input * input;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        System.out.println(calculateArea(radius));

        // print the area

    }
}
