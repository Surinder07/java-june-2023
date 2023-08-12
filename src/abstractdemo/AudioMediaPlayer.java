package abstractdemo;



public class AudioMediaPlayer extends MediaPlayer{

    public AudioMediaPlayer(int size, int capacity) {
        super(size, capacity);
    }

    @Override
    public void play() {
        System.out.println("Audio is playing" + size);
    }

    @Override
    public void pause() {
        System.out.println("Video is playing");
    }

    @Override
    public void stop() {
        System.out.println("Video is playing");
    }
}
