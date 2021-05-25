package io.testsmith.coffeemachine.machine;

import io.testsmith.coffeemachine.container.IContainer;
import io.testsmith.coffeemachine.container.NotEnoughException;
import io.testsmith.coffeemachine.domain.Portion;

public class CoffeeMachine implements ICoffeeMachine {

    private final IContainer coffeeContainer;
    private final IContainer waterContainer;

    public CoffeeMachine(IContainer cContainer, IContainer wContainer) {
        coffeeContainer = cContainer;
        waterContainer = wContainer;
    }

    @Override
    public boolean makeCoffee(Portion portion) throws NotEnoughException {

        boolean isEnoughCoffee = coffeeContainer.getPortion(portion);
        boolean isEnoughWater = waterContainer.getPortion(portion);

        return isEnoughCoffee && isEnoughWater;
    }

    @Override
    public IContainer getWaterContainer() {
        return waterContainer;
    }

    @Override
    public IContainer getCoffeeContainer() {
        return coffeeContainer;
    }

}