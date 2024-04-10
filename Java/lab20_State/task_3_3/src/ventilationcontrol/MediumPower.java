package ventilationcontrol;

public class MediumPower implements FanState {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighPower());
        System.out.println("Fan is on high");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowPower());
        System.out.println("Fan is on low");
    }
}
