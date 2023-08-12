package aug8.polyDemo;

public class Fruit {
    final String color = "Red";
    String shape;

     void showFruit(){
        System.out.println("display fruit ");
    }

     void showFruit(String a){
        System.out.println("display fruit ");
    }

    public final void eatFruit(){
        System.out.println("Eating fruit ");
    }
}

class Apple extends Fruit{

    void showFruit(){
        System.out.println("display frufgfsdit ");
    }

}

// final -- class --> can not be inherited
// method --- > can not be overriden
// variable --> can not be changed (becomes constant )