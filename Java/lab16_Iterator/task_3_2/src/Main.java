import shop.Shop;
import shop.ShopItem;
import shop.iterators.factories.*;

public class Main {
    public static void main(String[] args) {
        ShopItem pens = new ShopItem("pen", 175);
        ShopItem pencils = new ShopItem("pencil", 0);
        ShopItem paper = new ShopItem("paper", 500);

        Shop shop = new Shop();
        shop.putItem(pens);
        shop.putItem(pencils);
        shop.putItem(paper);

        shop.setIteratorFactory(new ShopIteratorQuantityFactory());

        for (ShopItem item : shop){
            System.out.println(item);
        }
    }
}
