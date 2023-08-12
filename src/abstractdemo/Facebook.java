package abstractdemo;

public class Facebook implements SocialMedia{
    @Override
    public void chat() {
        System.out.println("Chatting ");
    }



    @Override
    public void homePage() {

        System.out.println("home page ");
    }

    @Override
    public void loginPage() {

        System.out.println("Logingin  ");
    }
}
