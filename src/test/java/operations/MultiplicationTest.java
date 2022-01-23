package operations;

import calculator.Calculator;
import exception.CalculatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MultiplicationTest {
    private final Calculator calculator = new Calculator();

    @Test
    void passMultiplication() throws CalculatorException {
        assertEquals(4, calculator.calculate("MULTIPLICATION", 2, 2));
    }

    @Test
    void failMultiplication() throws CalculatorException{
        assertNotEquals(3, calculator.calculate("MULTIPLICATION", 1, 1));
    }

}
