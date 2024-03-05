package beverages;

import locations.ConsumptionLocation;
import milkadditives.MilkAdditive;

public class Coffee extends Beverage {
    public Coffee(int sugar, MilkAdditive milk, ConsumptionLocation location) {
        super(sugar, milk, location);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee " + super.milk.getMilkInfo() + " milk");

    }

    @Override
    public void drink() {
        System.out.println("Drinking coffee " + milk.getMilkInfo() + " milk, " + location.getLocationInfo());
    }


    @Override
    public int cost() {
        return 10;
    }
}