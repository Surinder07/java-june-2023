package aug8;

public class Laptop extends Computer{

    private String screenSize;

    public Laptop(String model, String color, String screenSize) {
        super(model, color);
        this.screenSize = screenSize;
    }

    public void printDetails(){
        System.out.println("Laptop Details " + screenSize);

    }
}
