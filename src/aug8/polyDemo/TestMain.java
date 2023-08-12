package aug8.polyDemo;

public class TestMain {
    public static void main(String[] args) {

        // Super class               child class
        Shape shape =  new Rectangle(5, 8);
        System.out.println("Area of rectangle : "+shape.getArea());

        // assign the object of child class to super class ref

        Shape shape1 =  new Circle(5);
        System.out.println("Area of rectangle : " +shape1.getArea());

    }
}
