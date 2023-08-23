package Aug19.enums;

public class Test {
    public static void main(String[] args) {

         Tim tim = new Tim();
        System.out.println(Tim.Size.S);
    }
}
class Tim{
    enum Size{
        S("Small size ");

        Size(String s) {
        }
    }
}
