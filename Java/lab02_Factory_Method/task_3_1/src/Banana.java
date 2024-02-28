import CoffeShopLib.Product;

public class Banana extends Product {

    protected Banana(float costPrice, float salePrice) {
        super(costPrice, salePrice);
        this.profit = salePrice - costPrice;
    }

    @Override
    public void showProfit(){
        System.out.printf("Banana: bought for %.2f, sold for %.2f, net profit:%n%+.2f%n",
                costPrice, salePrice, profit);
    }
}