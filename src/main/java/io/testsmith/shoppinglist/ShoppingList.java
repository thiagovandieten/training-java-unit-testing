package io.testsmith.shoppinglist;

import java.util.Collection;
import java.util.HashSet;

public class ShoppingList {

    private final Collection<String> list = new HashSet<String>();

    public boolean put(String item) {
        return list.add(item);
    }

    public boolean contains(String item) {
        return list.contains(item);
    }

    public void take(String item) throws NoSuchItemException {
        boolean result = list.remove(item);
        if (!result) {
            throw new NoSuchItemException(item + " not found on thee shopping list");
        }
    }
}
