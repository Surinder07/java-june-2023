package june27;

public class AssignmentOperator2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println(x<y  && x> z);   //  false  && logical AND operator
        System.out.println(x<y  && x< z); // true
        System.out.println(x<y  || (x >= z)); // true
        System.out.println(x>y  || x> z); // false
        /*
         AND :
         TRUE TRUE    -> TRUE

         */

       // System.out.println(x<y  || x > z);   // || logical OR operator
         // ! logical  NOT opertor   !x = 10;

    }
}
