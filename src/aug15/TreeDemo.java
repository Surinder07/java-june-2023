package aug15;

public class TreeDemo {
    public static void main(String[] args) {

       Furniture furniture = new Furniture() {
           @Override
           public void sit() {
               System.out.println("you can sit on a chair ");
           }

           @Override
           public void stand() {

           }

           @Override
           public void nothing() {

           }
       };
       furniture.sit();
       furniture.stand();
       furniture.nothing();

    }
}

// 9:10
// we can not make object of interface
// we can not make object of abstract class
// we can assign child class object to parent ref.

// Annoymous class
// inner class which does not have a name