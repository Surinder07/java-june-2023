package Aug5;

import java.util.Scanner;

class Vehicle1{
    String color;
    public Vehicle1(String color) {
        this.color = color;
    }
}

class Car1 extends Vehicle1{
    String bodyType;
    public Car1(String color, String bodyType) {
        super(color);
        this.bodyType = bodyType;
    }
    public void showCar(){
        System.out.println(bodyType+ " :  "+color);
    }
}
public class VehicleMain {
    public static void main(String[] args) {

        int x = 10;

        Car1 car1 = new Car1("Blue","Sedan");
        car1.showCar();

    }
}
