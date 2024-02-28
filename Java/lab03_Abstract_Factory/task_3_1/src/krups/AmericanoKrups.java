package krups;

import coffee.Americano;

public class AmericanoKrups implements Americano {
    private final int profit = 20;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold krups americano for " + profit + "!");
    }
}
