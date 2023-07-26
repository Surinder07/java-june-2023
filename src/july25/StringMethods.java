package july25;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "pragra";
        String s2 = "XYZ";
        String s3 = "keyboard";

        //System.out.println(s1.compareTo(s2));
        //System.out.println(s1.concat(s2));
        System.out.println(s1.replace('A', 'P'));
        System.out.println(s1.contains("Abc"));
        System.out.println(s1.contentEquals("Abc"));

        System.out.println(s1.indexOf("A"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toUpperCase());

        // array length ? arr.length ---- > property
   // length()  -- > method
        System.out.println(s1.length());
// p r a g ra
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.substring(2));

        // probelm :
        // create a string as pragra and make it as Niagra.
        // substring and replace.

        String name = "    Pragra     ";   // op -- Niagra
        //System.out.println(name.replace("Pr", "Ni"));
        System.out.println(name);

        System.out.println(name.trim());

        int num = 10;
        String s = String.valueOf(num);
        System.out.println(s + 10);



    }
}
