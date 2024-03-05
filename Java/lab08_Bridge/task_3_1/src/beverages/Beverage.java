package beverages;

import locations.ConsumptionLocation;
import milkadditives.MilkAdditive;

public abstract class Beverage {
    protected final int sugar;
    protected final MilkAdditive milk;
    protected final ConsumptionLocation location;

    public Beverage(int sugar, MilkAdditive milk, ConsumptionLocation location) {
        this.sugar = sugar;
        this.milk = milk;
        this.location = location;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();
}