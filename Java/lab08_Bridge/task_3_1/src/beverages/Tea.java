package beverages;

import locations.ConsumptionLocation;
import milkadditives.MilkAdditive;

public class Tea extends Beverage {
    public Tea(int sugar, MilkAdditive milk, ConsumptionLocation location) {
        super(sugar, milk, location);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tea " + super.milk.getMilkInfo() + " milk");

    }

    @Override
    public void drink() {
        System.out.println("Drinking tea " + milk.getMilkInfo() + " milk, " + location.getLocationInfo());
    }

    @Override
    public int cost() {
        return 7;
    }
}
