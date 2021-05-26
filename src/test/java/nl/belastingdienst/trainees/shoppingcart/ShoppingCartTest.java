package nl.belastingdienst.trainees.shoppingcart;

import io.testsmith.shoppingcart.Product;
import io.testsmith.shoppingcart.ProductNotFoundException;
import io.testsmith.shoppingcart.ShoppingCart;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void SeeIfItContainsNoItems() {
        assertEquals("Shopping cart aangemaakt, moet 0 items bevatten",
                shoppingCart.getItemCount(),
                0);
    }

    @Test
    public void SeeIfCartIsEmptyAfterClearing() {
        shoppingCart.addItem(new Product("Wortel", 1.30));
        assertEquals("Hoort 1 te zijn na de wortel", shoppingCart.getItemCount(), 1);
        shoppingCart.empty();
        assertEquals("Hoort nu leeg te zijn.", shoppingCart.getItemCount(), 0);
    }

    @Test
    public void SeeIfCartItemCountIncreasesAndDecreasesAndIfBalanceIsCorrect() throws ProductNotFoundException {
        Product[] products = {
                new Product("Appel", 0.85),
                new Product("100 pack Heineken", 109.10)
        };
        shoppingCart.empty();
        assertEquals("Hoort nu leeg te zijn.", 0, shoppingCart.getItemCount());
        shoppingCart.addItem(products[0]);
        assertEquals("Hoort 1 te zijn na de appel", 1, shoppingCart.getItemCount());
        assertEquals(shoppingCart.getBalance(), 0.85, 0.001);
        shoppingCart.addItem(products[1]);
        assertEquals("Hoort 2 te zijn na de Heineken", 2, shoppingCart.getItemCount());
        assertEquals(shoppingCart.getBalance(), 109.95, 0.001);
        shoppingCart.removeItem(products[0]);
        assertEquals("Hoort weer 1 te zijn na appel weggaat.", 1, shoppingCart.getItemCount());
        assertEquals(shoppingCart.getBalance(), 109.10, 0.001);

    }

    @Test (expected = ProductNotFoundException.class)
    public void TakeProductFromEmptyCart() throws ProductNotFoundException {
        shoppingCart.empty();
        assertEquals("Hoort nu leeg te zijn.", 0, shoppingCart.getItemCount());
        shoppingCart.removeItem(new Product("Schrondiger's item", 21));
    }
}
