package philips;

import coffee.Espresso;

public class EspressoPhilips implements Espresso {
    private final int profit = 23;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold philips espresso for " + profit + "!");
    }
}
