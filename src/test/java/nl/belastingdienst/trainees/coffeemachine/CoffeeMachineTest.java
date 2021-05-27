package nl.belastingdienst.trainees.coffeemachine;

import io.testsmith.coffeemachine.container.CoffeeContainer;
import org.junit.Assert;
import org.junit.Test;

public class CoffeeMachineTest {
    @Test
    public void DoesCoffeeMachineHaveAContainer() {
        //We test here if the coffee machine has a container
        CoffeeContainer container = new CoffeeContainer(10);
        Assert.assertEquals("Initated with 10, so get 10 back", container.getCurrentVolume(), 10);
    }
}
