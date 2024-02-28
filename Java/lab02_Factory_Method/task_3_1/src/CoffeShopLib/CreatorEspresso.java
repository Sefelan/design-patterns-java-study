package CoffeShopLib;

public class CreatorEspresso extends Creator {
    @Override
    public Product createProduct() {
        return new Espresso(costPrice,salePrice);
    }
}
