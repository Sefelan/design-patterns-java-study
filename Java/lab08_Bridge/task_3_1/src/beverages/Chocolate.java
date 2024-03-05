package beverages;

import locations.ConsumptionLocation;
import milkadditives.MilkAdditive;

public class Chocolate extends Beverage {
    public Chocolate(int sugar, MilkAdditive milk, ConsumptionLocation location) {
        super(sugar, milk, location);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao " + super.milk.getMilkInfo() + " milk");

    }

    @Override
    public void drink() {
        System.out.println("Drinking coffee " + milk.getMilkInfo() + " milk, " + location.getLocationInfo());
    }

    @Override
    public int cost() {
        return 15;
    }
}
