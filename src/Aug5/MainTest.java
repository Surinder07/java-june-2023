package Aug5;


class Vehicle{
    String color;
    int speed;
    int numOfTyres;

    public void display(){
        System.out.println("color :" + color);
        System.out.println("speed :" + speed);
        System.out.println("num of tyres :" + numOfTyres);
    }

}

class Car extends Vehicle{

    String fuleType;
    public void display(){
        System.out.println("fuel type :"+ fuleType);
    }
}

public class MainTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();

    }
}

/*

constructor
default and parameterized
chaining of const.
this keyword
intro to oops

 */
