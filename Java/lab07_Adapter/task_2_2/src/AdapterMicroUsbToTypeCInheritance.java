import phones.Charger;
import phones.ChargerTypeC;

public class AdapterMicroUsbToTypeCInheritance extends Charger implements ChargerTypeC {

    public AdapterMicroUsbToTypeCInheritance(float voltage, float amperage) {
        super(voltage, amperage);
    }

    @Override
    public float getOutputPower() {
        return getOutputAmperage() * getOutputVoltage();
    }
}