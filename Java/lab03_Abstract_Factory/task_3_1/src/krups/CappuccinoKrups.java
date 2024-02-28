package krups;

import coffee.Cappuccino;

public class CappuccinoKrups implements Cappuccino {
    private final int profit = 22;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold krups cappuccino for " + profit + "!");
    }
}
