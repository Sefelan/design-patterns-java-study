package phones;

public class Charger implements ChargerMicroUSB{
    private final float voltage;
    private final float amperage;

    public Charger(float voltage, float amperage) {
        this.voltage = voltage;
        this.amperage = amperage;
    }

    public float getOutputVoltage() {
        return this.voltage;
    }

    public float getOutputAmperage() {
        return this.amperage;
    }
}
