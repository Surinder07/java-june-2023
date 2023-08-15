package aug12;

public abstract class MediaPlayer {

    int size;
    int capacity;

    public MediaPlayer(int size, int capacity) {
        this.size = size;
        this.capacity = capacity;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    public void test(){
        System.out.println("testing in the media player");
    }

}

