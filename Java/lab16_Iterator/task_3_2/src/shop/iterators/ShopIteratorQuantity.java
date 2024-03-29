package shop.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import shop.Shop;
import shop.ShopItem;

public class ShopIteratorQuantity implements Iterator<ShopItem> {
    private final List<ShopItem> sortedItems;
    private int iterationState;

    public ShopIteratorQuantity(Shop shop) {
        this.sortedItems = new ArrayList<>(shop.getItems().values());
        this.sortedItems.sort((item1, item2) -> Integer.compare(item2.getQuantity(), item1.getQuantity()));
        this.iterationState = 0;
    }

    @Override
    public boolean hasNext() {
        return iterationState < sortedItems.size();
    }

    @Override
    public ShopItem next() {
        return sortedItems.get(iterationState++);
    }
}