package CoffeShopLib;

abstract public class Product {
    final protected float costPrice;
    final protected float salePrice;
    protected float profit;

    protected Product(float costPrice, float salePrice) {
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    protected float getProfit() {
        return profit;
    }

    abstract public void showProfit();
}