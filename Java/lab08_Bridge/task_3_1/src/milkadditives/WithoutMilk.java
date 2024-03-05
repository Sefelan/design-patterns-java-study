package milkadditives;

import milkadditives.MilkAdditive;

public class WithoutMilk implements MilkAdditive {
    @Override
    public String getMilkInfo() {
        return "without";
    }
}