package philips;

import coffee.Americano;

public class AmericanoPhilips implements Americano {
    private final int profit = 15;

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public void flashTheCash() {
        System.out.println("We sold philips americano for " + profit + "!");
    }
}
