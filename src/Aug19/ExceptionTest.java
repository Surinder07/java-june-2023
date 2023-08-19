package Aug19;

import java.util.Scanner;

// try with resources
public class ExceptionTest {
    public static void main(String[] args) {

        String name = "pragra ";
        name = null;
        int x = 10;

        // try with resources
        try( Scanner scanner = new Scanner(System.in))
        {
            System.out.println(name.toLowerCase());
            System.out.println("Code at line number 11");

        }catch (NullPointerException e){  // junior dev
            e.printStackTrace();
        }

    }
}
