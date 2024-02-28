package philips;

import coffee.Cappuccino;

public class CappuccinoPhilips implements Cappuccino {
    private final int profit = 27;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold philips cappuccino for " + profit + "!");
    }
}
