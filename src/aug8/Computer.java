package aug8;

public class Computer {
    private String model;
    private String color;

    public Computer(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Model :" + model);
        System.out.println("Color :" + color);
    }
}

//this()
