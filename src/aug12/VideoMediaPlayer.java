package aug12;

public class VideoMediaPlayer extends MediaPlayer{
    public VideoMediaPlayer(int size, int capacity) {
        super(size, capacity);
    }

    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void pause() {
        System.out.println("Pause video ");
    }

    @Override
    public void stop() {
        System.out.println("Stop video");
    }
}
