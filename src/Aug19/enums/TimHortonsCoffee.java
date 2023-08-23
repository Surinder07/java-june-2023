package Aug19.enums;

public class TimHortonsCoffee {

    public static void main(String[] args) {
        serveCoffee();
        Size size = null;
        switch (size){
            case MEDIUM :
                System.out.println("medium coffee ");
        }
    }
    public static void serveCoffee(){
        System.out.println(Size.LARGE +" "+Size.SMALL );
        System.out.println("I want a coffee " +Size.MEDIUM + " Steeped tea, double double ");

        System.out.println("I want a coffee " +Size.SMALL + " Steeped tea, double double ");

    }
}

// create a class called enum Payment -- credit, debit, paypal , mastercard
