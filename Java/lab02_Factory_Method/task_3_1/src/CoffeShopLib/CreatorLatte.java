package CoffeShopLib;

public class CreatorLatte extends Creator {
    @Override
    public Product createProduct() {
        return new Latte(costPrice,salePrice);
    }
}
