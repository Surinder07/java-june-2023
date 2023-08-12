package abstractdemo;

public class MainDemo {
    public static void main(String[] args) {



        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        runnable.run();



        Website website = new Website() {
            @Override
            public void homePage() {
                System.out.println("Home page");
            }

            @Override
            public void loginPage() {

                System.out.println("login page ");
            }
        };
        website.homePage();
        website.loginPage();


     /*   Facebook facebook = new Facebook();
        facebook.chat();
        facebook.homePage();
        facebook.loginPage();
        facebook.uploadImages();*/

    }
}
