package media;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PausedState());
        System.out.println("Music paused");
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
        System.out.println("Music playing, track - " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
        System.out.println("Music playing, track - " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(0);
        mediaPlayer.setState(new PausedState());
        System.out.println("Music stopped");
    }
}
