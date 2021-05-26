package io.testsmith.shoppinglist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShoppingListTest {
    private ShoppingList list;

    @Before
    public void setup() {
        list = new ShoppingList();
    }

    @Test
    public void putItem() {
        list.put("eggs");
        Assert.assertTrue(list.contains("eggs"));
    }

    @Test
    public void takeItem() throws NoSuchItemException {
        list.put("eggs");
        Assert.assertTrue(list.contains("eggs"));
        list.take("eggs");
        Assert.assertFalse(list.contains("eggs"));
    }

    @Test(expected = NoSuchItemException.class)
    public void takeNonExistingItem() throws NoSuchItemException {
        list.take("milk");
    }
}
