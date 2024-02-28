package krups;

import coffee.Latte;

public class LatteKrups implements Latte {
    private final int profit = 25;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold krups latte for " + profit + "!");
    }
}
