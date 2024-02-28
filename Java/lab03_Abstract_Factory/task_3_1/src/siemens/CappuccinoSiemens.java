package siemens;

import coffee.Cappuccino;

public class CappuccinoSiemens implements Cappuccino {
    private final int profit = 17;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold philips cappuccino for " + profit + "!");
    }
}
