package shop.iterators.factories;

import java.util.Iterator;
import shop.Shop;
import shop.ShopItem;
import shop.iterators.ShopIteratorQuantity;

public class ShopIteratorQuantityFactory implements IteratorFactory {
    @Override
    public Iterator<ShopItem> createIterator(Shop shop) {
        return new ShopIteratorQuantity(shop);
    }

}
