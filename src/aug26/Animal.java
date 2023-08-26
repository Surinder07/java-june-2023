package aug26;

@FunctionalInterface
public interface Animal {
    void sleep();
}

class TestMain{
    public static void main(String[] args) {

        //Animal animal = () -> System.out.println("Animal is sleeping");

        callAnimal(() ->
                System.out.println("Animal is sleeping")
                
        );

    }

    public static void callAnimal(Animal t){
        System.out.println("calling animal ");
    }
}