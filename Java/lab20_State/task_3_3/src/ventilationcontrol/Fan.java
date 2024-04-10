package ventilationcontrol;

public class Fan {

    private FanState state;

    public Fan() {
        this.state = new TurnedOff();
    }

    void setState(FanState state) {
        this.state = state;
    }


    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }

}
