package philips;

import coffee.Latte;

public class LattePhilips implements Latte {
    private final int profit = 20;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold philips latte for " + profit + "!");
    }
}
