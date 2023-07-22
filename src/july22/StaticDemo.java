package july22;

public class StaticDemo {
    {
        System.out.println("Inside normal block");
    }

    static{
        System.out.println("Inside static block ");
    }

    public static void main(String[] args) {
    new StaticDemo(); // created
    }
}
