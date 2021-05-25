package io.testsmith.coffeemachine.container;

public class NotEnoughException extends Exception {

    public NotEnoughException(String text) {
        super(text);
    }

}