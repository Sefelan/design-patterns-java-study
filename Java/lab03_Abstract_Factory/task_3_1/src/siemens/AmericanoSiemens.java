package siemens;

import coffee.Americano;

public class AmericanoSiemens implements Americano {
    private final int profit = 25;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold philip americano for " + profit + "!");
    }
}
