package media;

public class PausedState implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        System.out.println("Music playing, track - " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
        play(mediaPlayer);
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
        play(mediaPlayer);
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(0);
        mediaPlayer.setState(new PausedState());
    }
}
