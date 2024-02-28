package CoffeShopLib;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private final List<Product> soldProducts = new ArrayList<>();

    protected float totalProfit = 0;

    public void sellProduct(Creator productCreator){
        Product product = productCreator.createProduct();
        totalProfit += product.getProfit();
        product.showProfit();
        soldProducts.add(productCreator.createProduct());
    }

    public void getTotal(){
        System.out.printf("Total profit for the day:%n%+.2f%n", totalProfit);
    }

}