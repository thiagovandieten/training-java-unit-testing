package nl.belastingdienst.trainees.calculator;

import io.testsmith.calculator.Calculator;
import io.testsmith.calculator.exception.CannotDivideByZeroException;
import io.testsmith.calculator.exception.InvalidInputException;
import io.testsmith.calculator.exception.MaxInputException;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test(expected = MaxInputException.class)
    public void TryAInputOver10000() throws MaxInputException, InvalidInputException {
        calculator.add(11000,9000);
    }

    @Test
    public void DivideByZero() throws MaxInputException, CannotDivideByZeroException {
        calculator.divide(3000, 0);
    }
}
