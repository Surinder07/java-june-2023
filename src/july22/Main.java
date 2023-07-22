package july22;

public class Main {
    public static void main(String[] args) {

     Tesla t1 = new Tesla();
     t1.model = "Model X";
     t1.color = "black";
     t1.price = 60000;
     Tesla.engineType = "electric";

    t1.makeCar(t1);


    }
}
