package july22;

public class Tesla {

      String model;
      String color;
      double price;
      static String engineType;

      public static void makeCar(Tesla t){
          System.out.println(t.model + "  : "+ t.color + " " + t.price + " " +engineType);
      }
}


