import CoffeShopLib.Product;
import CoffeShopLib.Creator;


public class CreatorBanana extends Creator {
    @Override
    public Product createProduct() {
        return new Banana(costPrice,salePrice);
    }
}
