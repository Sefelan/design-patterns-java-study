package siemens;

import coffee.Latte;

public class LatteSiemens implements Latte {
    private final int profit = 25;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold siemens latte for " + profit + "!");
    }
}
