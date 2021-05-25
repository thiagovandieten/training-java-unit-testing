package io.testsmith.coffeemachine.machine;

import io.testsmith.coffeemachine.container.IContainer;
import io.testsmith.coffeemachine.container.NotEnoughException;
import io.testsmith.coffeemachine.domain.Portion;

public interface ICoffeeMachine {

    boolean makeCoffee(Portion portion) throws NotEnoughException;

    IContainer getCoffeeContainer();

    IContainer getWaterContainer();

}