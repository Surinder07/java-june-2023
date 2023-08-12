package assignment.aug12.abstractdemo;

public class Mobile implements Computer, Telephone, Camera{
    @Override
    public void calculate() {

        System.out.println("Calcuating");
    }

    @Override
    public void surfInternet() {

        System.out.println("Surfing the internet ");
    }

    @Override
    public void makeCalls() {
        System.out.println("Making call ");
    }

    @Override
    public void receiveCalls() {

        System.out.println("Receing a call ");
    }

    @Override
    public void takePictures() {
        System.out.println("taking pictures");
    }

    @Override
    public void shootVideos() {

        System.out.println("taking videos..");
    }
}
