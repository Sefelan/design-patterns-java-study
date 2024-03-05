package milkadditives;

import milkadditives.MilkAdditive;

public class WithMilk implements MilkAdditive {
    private final int milkVolume;

    public WithMilk(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    @Override
    public String getMilkInfo() {
        return "with " + milkVolume + "ml of";
    }
}