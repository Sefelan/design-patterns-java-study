package phones;

public class SamsungGalaxyS24Ultra {

    private int chargingPercent = 0;
    private ChargerTypeC chargerTypeC = null;

    public void pluginCharger(ChargerTypeC chargerTypeC) {
        this.chargerTypeC = chargerTypeC;
        System.out.println("Type-C charger connected");
    }

    public void unplugCharger() {
        System.out.println("Type-C charger disconnected");
        this.chargerTypeC = null;
    }

    public void charge(int time) {
        if (chargerTypeC == null) {
            System.out.println("Please connect Type-C charger charger to start charging");
        }
        else {
            float timeH = time / 9.0f;
            int percent = chargingPercent + (int) (chargerTypeC.getOutputPower() * timeH);
            chargingPercent = Math.min(percent, 100);
        }
    }

    public int getChargingPercent() {
        return chargingPercent;
    }

    public void makeCall() {
        if (chargingPercent > 5) {
            System.out.println("Call in progress...");
            chargingPercent -= 5;
        } else {
            System.out.println("To make a call, please charge the phone");
        }
    }
}
