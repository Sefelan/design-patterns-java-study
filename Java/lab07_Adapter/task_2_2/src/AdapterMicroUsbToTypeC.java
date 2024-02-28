import phones.ChargerMicroUSB;
import phones.ChargerTypeC;

public class AdapterMicroUsbToTypeC implements ChargerTypeC {
    private ChargerMicroUSB chargerMicroUSB;

    public AdapterMicroUsbToTypeC(ChargerMicroUSB chargerMicroUSB) {
        this.chargerMicroUSB = chargerMicroUSB;
    }

    @Override
    public float getOutputPower() {
        return chargerMicroUSB.getOutputAmperage() * chargerMicroUSB.getOutputVoltage();
    }
}