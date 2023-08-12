package assignment.aug12.abstractdemo;

public class MainDemo {
    public static void main(String[] args) {
        MediaPlayer videoMediaPlayer = new VideoMediaPlayer();
        videoMediaPlayer.play();
        videoMediaPlayer.pause();
        videoMediaPlayer.stop();
        videoMediaPlayer.test();

        MediaPlayer audioMediaPlayer = new AudioMediaPlayer();
        audioMediaPlayer.pause();
        audioMediaPlayer.play();
        audioMediaPlayer.stop();
    }
}
