package media;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    private List<String> tracks;
    private State state;
    private int currentTrackNum;

    public MediaPlayer() {
        tracks = new ArrayList<>();
        state = new PausedState();
        currentTrackNum = 0;
    }

   String getCurrentTrack() {
        return tracks.get(currentTrackNum);
    }

   void setTrackNum(int trackNum) {
        if (trackNum < 0 || trackNum >= tracks.size()) {
            return;
        }
        this.currentTrackNum = trackNum;
    }

    void setState(State state) {
        this.state = state;
    }

    int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    public void stop() {
        state.stop(this);
    }
}
