package io.testsmith.calculator.exception;

public class MaxInputException extends Exception {
    public MaxInputException() {
        super("Input cannot be greater than 100000.");
    }
}
