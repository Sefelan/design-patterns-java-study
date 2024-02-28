package CoffeShopLib;

public class Cappuccino extends Product {
    private final float maintenanceCost = 1; //1 for extra maintenance cost

    public Cappuccino(float costPrice, float salePrice) {
        super(costPrice, salePrice);
        this.profit = salePrice - maintenanceCost - costPrice;
    }

    @Override
    public void showProfit(){
        System.out.printf("Latte: bought components for %.2f + %.2f maintenance cost, sold for %.2f, net profit:%n%+.2f%n",
                costPrice, maintenanceCost, salePrice, profit);
    }
}