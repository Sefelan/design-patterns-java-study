package shop.iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import shop.Shop;
import shop.ShopItem;

public class ShopIteratorName implements Iterator<ShopItem> {
    private final HashMap<String, ShopItem> items;
    private final List<String> sortedNames;
    private int iterationState;

    public ShopIteratorName(Shop shop) {
        this.items = shop.getItems();
        sortedNames = new ArrayList<>(items.keySet());
        sortedNames.sort(String::compareTo);
        this.iterationState = 0;
    }

    @Override
    public boolean hasNext() {
        return iterationState < sortedNames.size();
    }

    @Override
    public ShopItem next() {
        return items.get(sortedNames.get(iterationState++));
    }
}
