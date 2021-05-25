package io.testsmith.calculator.exception;

public class CannotDivideByZeroException extends Exception {

    public CannotDivideByZeroException() {
        super("Cannot divide by zero.");
    }
}
