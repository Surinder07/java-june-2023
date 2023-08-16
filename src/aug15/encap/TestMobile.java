package aug15.encap;

public class TestMobile {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.getBrand();
        mobile.getCapacity();
        System.out.println(mobile.getScreenSize());

        mobile.setBrand("Samsung");
        mobile.setScreenSize(2.4);
        System.out.println(mobile.getBrand());
        System.out.println(mobile.getScreenSize());

        // Collections - object


    }
}
