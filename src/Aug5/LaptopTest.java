package Aug5;

class Laptop{

    String brand;
    String processor;

    public Laptop(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }

    public void showLaptop(){

    }
}
class Dell extends Laptop{

    String screenSize;
    String brand = "HP";

    public Dell(String brand, String processor, String screenSize) {
        super(brand, processor);
        this.screenSize = screenSize;
    }

    public void createDell(){
        super.showLaptop();
        System.out.println("Brand :"+super.brand + "process  "+processor + " screen size : " + screenSize);
    }
}

public class LaptopTest {
    public static void main(String[] args) {

        Dell dell = new Dell("Aspiron", "i3","15");
        dell.createDell();
    }
}
