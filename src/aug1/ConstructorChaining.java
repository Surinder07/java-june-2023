package aug1;

class Mobile{

    private String brand;
    private int capacity;
    private String color;

    Mobile(){
        System.out.println("Hello inside the default constructor ");
    }

    public Mobile(String brand, int capacity) {
         // reffering to default constructor
        this(); //
        this.brand = brand;
        this.capacity = capacity;
    }

    public void printDate(){
        System.out.println("Mobile : " + brand + " /" + capacity);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile("Apple",128);
        //mobile1.printDate();

    }
}
