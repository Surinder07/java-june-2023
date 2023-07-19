package july18;

public class StaticTest {
    static int count = 0;  // shareable

    //same name class name . initiliaze object
     StaticTest() {
         count ++;
         System.out.println(count);
    }
    public static void main(String[] args) {

         StaticTest staticTest = new StaticTest();
         StaticTest staticTest2 = new StaticTest();
         StaticTest staticTest3 = new StaticTest();
         StaticTest staticTest4 = new StaticTest();
    }
}
