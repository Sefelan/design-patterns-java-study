package media;

public class MediaPlayer {

    private State state;
    private String icon;

    public MediaPlayer() {
        state = new PausedState();
        icon =  "play button";
    }

    void setState(State state) {
        this.state = state;
    }

    String getIcon() {
        return icon;
    }

    void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}
