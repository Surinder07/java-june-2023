package aug8.polyDemo;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
}
/*


Car --> tesla -- self driving feature
 */