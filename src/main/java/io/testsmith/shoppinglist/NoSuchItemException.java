package io.testsmith.shoppinglist;

public class NoSuchItemException extends Exception {
    public NoSuchItemException(String message) {
        super(message);
    }
}