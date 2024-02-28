package krups;

import coffee.Espresso;

public class EspressoKrups implements Espresso {
    private final int profit = 18;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold krups espresso for " + profit + "!");
    }
}
