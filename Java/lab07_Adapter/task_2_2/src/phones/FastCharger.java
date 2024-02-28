package phones;

public class FastCharger implements ChargerTypeC{

    private final float power;

    public FastCharger(float power) {
        this.power = power;
    }

    public float getOutputPower() {
        return power;
    }
}
