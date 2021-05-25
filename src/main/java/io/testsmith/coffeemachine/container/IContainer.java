package io.testsmith.coffeemachine.container;

import io.testsmith.coffeemachine.domain.Portion;

public interface IContainer {

    boolean getPortion(Portion portion) throws NotEnoughException;

    int getCurrentVolume();

    int getTotalVolume();

    void refillContainer();

}