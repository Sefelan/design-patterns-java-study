package shop;

import java.util.HashMap;
import java.util.Iterator;

import shop.iterators.factories.*;

public class Shop implements Iterable<ShopItem> {
    private final HashMap<String, ShopItem> items = new HashMap<>();
    private IteratorFactory iteratorFactory;

    public Shop() {
        this.iteratorFactory = new ShopIteratorNameFactory();
    }

    public void putItem(ShopItem item) {
        items.put(item.getName(), item);
    }

    public HashMap<String, ShopItem> getItems() {
        return items;
    }
    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    @Override
    public Iterator<ShopItem> iterator() {
        return iteratorFactory.createIterator(this);
    }


}
