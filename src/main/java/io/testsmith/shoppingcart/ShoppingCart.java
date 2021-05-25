package io.testsmith.shoppingcart;

import java.util.Collection;
import java.util.HashSet;

public class ShoppingCart {

    private final Collection<Product> items;

    public ShoppingCart() {
        items = new HashSet<>();
    }

    public double getBalance() {
        double balance = 0.00;
        for (Product product: items){
            balance += product.getPrice();
        }
        return balance;
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void removeItem(Product item)
            throws ProductNotFoundException {
        if (!items.remove(item)) {
            throw new ProductNotFoundException();}
    }

    public int getItemCount() {
        return items.size();
    }

    public void empty() {
        items.clear();
    }
}
