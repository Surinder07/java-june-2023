package june27;

public class AssignmentDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int temp;  // decalration

        temp = x;  // x: 10, temp : 10
        x = y;  // y : 20, x : 20
        y = temp;  // temp : 10, y : 10

        System.out.println(" X  : "+x);
        System.out.println(" Y  : "+y);


        /*
         swap values
        before : x = 10 , y = 20;
          operation
        after   y = 10, x = 20
            */

    }
    
}
