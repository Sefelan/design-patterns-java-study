package ventilationcontrol;

public class HighPower implements FanState {
    @Override
    public void turnUp(Fan fan) {
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumPower());
        System.out.println("Fan is on medium");
    }
}
