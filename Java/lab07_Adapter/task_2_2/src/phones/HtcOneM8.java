package phones;

public class HtcOneM8 {

    private int chargingPercent = 0;
    private ChargerMicroUSB chargerMicroUSB = null;

    public void pluginCharger(ChargerMicroUSB chargerMicroUSB) {
        this.chargerMicroUSB = chargerMicroUSB;
        System.out.println("Micro USB charger connected");
    }

    public void unplugCharger() {
        System.out.println("Micro USB charger disconnected");
        this.chargerMicroUSB = null;
    }

    public void charge(int time) {
        if (this.chargerMicroUSB == null) {
            System.out.println("Please connect Micro USB charger to start charging");
        }
        else {
            float timeH = (float)time / 9.0F;
            float power = this.chargerMicroUSB.getOutputAmperage() * this.chargerMicroUSB.getOutputVoltage();
            int percent = this.chargingPercent + (int)(power * timeH);
            this.chargingPercent = Math.min(percent, 100);
        }
    }

    public int getChargingPercent() {
        return this.chargingPercent;
    }

    public void call(float time) {
        if ((float)this.chargingPercent < time) {
            System.out.println("Please charge your phone before making a call");
        } else {
            this.chargingPercent = (int)((float)this.chargingPercent - time);
            System.out.println("Call in progress...");
        }
    }
}
