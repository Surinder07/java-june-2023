package aug15.encap;

public class Mobile {

    private String brand = "Apple";
    private int capacity = 128;
    private Double screenSize = 6.4;

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }
}

