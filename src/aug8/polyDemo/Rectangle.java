package aug8.polyDemo;

public class Rectangle extends Shape{
    double width;
    double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override  // annotation.
    public double getArea() {
        return width * height;
    }
}

//  Small exercise
// Animal class   --- makeSound()
// Dog ,  makeSound()   -- dog barks
// Cat  makeSound()  -- cat meow
// assign the Object of Dog , Cat both to Animal class

