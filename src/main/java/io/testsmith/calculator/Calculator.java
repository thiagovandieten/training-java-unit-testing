package io.testsmith.calculator;

import io.testsmith.calculator.exception.CannotDivideByZeroException;
import io.testsmith.calculator.exception.InvalidInputException;
import io.testsmith.calculator.exception.MaxInputException;
import io.testsmith.calculator.exception.MaxMultiplyInputException;

public class Calculator {

    public double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 10000) {
            throw new MaxInputException();
        }
        if (a == 99 && b == 99) {
            throw new InvalidInputException("Cannot add 99 and 99");
        }
        return a + b;
    }

    public double subtract(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 10000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    public double multiplyBy(double a, double b) throws MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 10000) {
            throw new MaxInputException();
        }
        if (a > 5000 || b > 5000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    public double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000 || b > 10000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}
