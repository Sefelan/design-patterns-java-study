package ventilationcontrol;

public class LowPower implements FanState {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumPower());
        System.out.println("Fan is on medium");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new TurnedOff());
        System.out.println("Fan turned OFF");
    }
}
