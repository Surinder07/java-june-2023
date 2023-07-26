package july25;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "pragra";
        String s2 = "pragra";
        String s3 = new String("pragra");
        String s4 = new String("pragra1");

  // ==  and .equals
        System.out.println(s1 == s2);  // true  ,, checks the memory address - content
        System.out.println(s1 == s3);  // false   ,, diff memory address
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4));


    }

}



// what is string ?
// collections of character or arrays of characters
// primitive data type
// non primitive database ?

// class ?
/*

String s1 = "Pragra"; // literal
        System.out.println(s1);

        String s2 = new String("Praga");
        // String is immutable ? can not be changed // can not update itself?
 */