package CoffeShopLib;

public class CreatorAmericano extends Creator {
    @Override
    public Product createProduct() {
        return new Americano(costPrice,salePrice);
    }
}
