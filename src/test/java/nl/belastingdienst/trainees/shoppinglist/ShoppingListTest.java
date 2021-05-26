package nl.belastingdienst.trainees.shoppinglist;

import io.testsmith.shoppinglist.NoSuchItemException;
import io.testsmith.shoppinglist.ShoppingList;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingListTest {

    private final ShoppingList shoppingList = new ShoppingList();

    @Test
    public void putItemInTheShoppingList() {
        shoppingList.put("Aardappel");
        Assert.assertTrue("shoppingList heeft een aardappel door middel van zijn contains method",
                shoppingList.contains("Aardappel"));
    }

    @Test
    public void TakeItemFromTheShoppingList() throws NoSuchItemException {
        shoppingList.take("Aardappel");
        shoppingList.contains("Aardappel");
        Assert.assertFalse("ShoppingList.contains moet nu een false terugeven",
                shoppingList.contains("Aardappel"));
    }

    @Test(expected = NoSuchItemException.class)
    public void TakeNonExistantItemFromTheShoppingList() throws NoSuchItemException {
        shoppingList.take("Cucumber");
    }
}
