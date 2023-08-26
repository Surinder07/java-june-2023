package aug26;

@FunctionalInterface
public interface Student {
    void test(int a, int b);
}


class Main{
    public static void main(String[] args) {


        Student student1 =    ( a,  b)  -> {
            System.out.println(a );
            System.out.println(b);
        };

    }
}