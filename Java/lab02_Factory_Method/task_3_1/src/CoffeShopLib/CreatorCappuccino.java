package CoffeShopLib;

public class CreatorCappuccino extends Creator {
    @Override
    public Product createProduct() {
        return new Cappuccino(costPrice,salePrice);
    }
}
