package siemens;

import coffee.Espresso;

public class EspressoSiemens implements Espresso {
    private final int profit = 13;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold siemens espresso for " + profit + "!");
    }
}
