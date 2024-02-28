package CoffeShopLib;

public class Latte extends Product {
    private final float extraCosts = 3; //3 for extra maintenance cost

    protected Latte(float costPrice, float salePrice) {
        super(costPrice, salePrice);
        this.profit = salePrice - extraCosts - costPrice;
    }

    @Override
    public void showProfit(){
        System.out.printf("Latte: bought components for %.2f + %.2f extra costs, sold for %.2f, net profit:%n%+.2f%n",
                costPrice, extraCosts, salePrice, profit);
    }
}
