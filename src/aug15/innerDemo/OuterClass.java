package aug15.innerDemo;

public class OuterClass {
    String name = "Mike";
    public void outerMethod(){
        System.out.println("Outer class method");
    }

     class InClass{
         int x = 10;

         public void insideMethod(){
             System.out.println("Inner class method");
         }

     }
}



