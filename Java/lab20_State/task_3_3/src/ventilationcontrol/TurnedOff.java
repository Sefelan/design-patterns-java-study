package ventilationcontrol;

public class TurnedOff implements FanState {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new LowPower());
        System.out.println("Fan is on low");
    }

    @Override
    public void turnDown(Fan fan) {
    }
}
