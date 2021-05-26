package io.testsmith.shoppingcart;

import org.junit.Assert;
import org.junit.Test;

import java.net.PortUnreachableException;

public class CartTest {

    @Test
    public void addProduct() throws ProductNotFoundException {
        // arrange
        Product product1 = new Product("tv", 255.0);
        Product product2 = new Product("Fridge", 255.0);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1);
        cart.addItem(product2);

        Assert.assertEquals(2, cart.getItemCount());
        cart.removeItem(product1);
        Assert.assertEquals(1, cart.getItemCount());
    }
}
