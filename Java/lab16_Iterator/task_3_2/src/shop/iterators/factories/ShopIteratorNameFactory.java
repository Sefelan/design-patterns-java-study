package shop.iterators.factories;

import java.util.Iterator;
import shop.Shop;
import shop.ShopItem;
import shop.iterators.ShopIteratorName;

public class ShopIteratorNameFactory implements IteratorFactory {
    @Override
    public Iterator<ShopItem> createIterator(Shop shop) {
        return new ShopIteratorName(shop);
    }
}
