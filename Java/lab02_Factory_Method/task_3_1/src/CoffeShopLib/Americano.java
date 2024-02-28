package CoffeShopLib;

public class Americano extends Product {
    protected Americano(float costPrice, float salePrice) {
        super(costPrice, salePrice);
        this.profit = salePrice - costPrice;
    }

    @Override
    public void showProfit() {
        System.out.printf("Americano: bought components for %.2f, sold for %.2f, net profit:%n%+.2f%n",
                costPrice, salePrice, profit);
    }
}
