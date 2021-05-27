package io.testsmith.coffeemachine;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.testsmith.coffeemachine.container.CoffeeContainer;
import io.testsmith.coffeemachine.container.IContainer;
import io.testsmith.coffeemachine.container.NotEnoughException;
import io.testsmith.coffeemachine.container.WaterContainer;
import io.testsmith.coffeemachine.domain.Portion;
import io.testsmith.coffeemachine.machine.CoffeeMachine;
import io.testsmith.coffeemachine.machine.ICoffeeMachine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeMachineTest {

    ICoffeeMachine coffeeMachine;
    IContainer coffeeContainer;
    IContainer waterContainer;

    @Before
    public void setUp() {
        coffeeContainer = mock(CoffeeContainer.class);
        waterContainer = mock(WaterContainer.class);
        coffeeMachine = new CoffeeMachine(coffeeContainer, waterContainer);
    }

    @After
    public void tearDown() {
        coffeeContainer = null;
        waterContainer = null;
        coffeeMachine = null;
    }

    @Test
    public void testMakeCoffee() throws NotEnoughException {
        when(coffeeContainer.getPortion(Portion.LARGE)).thenReturn(true);
        when(waterContainer.getPortion(Portion.LARGE)).thenReturn(true);

        assertTrue(coffeeMachine.makeCoffee(Portion.LARGE));
    }

    @Test
    public void testNotEnoughException() throws NotEnoughException {
        when(coffeeContainer.getPortion(Portion.LARGE)).thenReturn(false);

        when(waterContainer.getPortion(Portion.LARGE)).thenReturn(true);

        assertFalse(coffeeMachine.makeCoffee(Portion.LARGE));
    }

}