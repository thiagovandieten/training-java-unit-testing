package io.testsmith.calculator.exception;

public class MaxMultiplyInputException extends Exception {
    public MaxMultiplyInputException() {
        super("Input cannot be greater that 5000 while multiplying");
    }
}
