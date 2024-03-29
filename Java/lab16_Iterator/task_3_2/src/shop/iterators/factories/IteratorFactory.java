package shop.iterators.factories;

import java.util.Iterator;
import shop.*;

public interface IteratorFactory {
    Iterator<ShopItem> createIterator(Shop shop);
}
