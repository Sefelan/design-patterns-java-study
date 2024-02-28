package CoffeShopLib;

public class Espresso extends Product {

    public Espresso(float costPrice, float salePrice) {
        super(costPrice, salePrice);
        this.profit = (float) ((salePrice - costPrice)*0.8);
    }

    @Override
    public void showProfit() {
        System.out.printf("Espresso: bought components for %.2f* 0.8, sold for %.2f, net profit (20%% margin):%n%+.2f%n",
                costPrice, salePrice, profit);
    }
}