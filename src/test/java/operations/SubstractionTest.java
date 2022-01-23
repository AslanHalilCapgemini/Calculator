package operations;

import calculator.Calculator;
import exception.CalculatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SubstractionTest {
    private final Calculator calculator = new Calculator();

    @Test
    void passSubstraction() throws CalculatorException {
        assertEquals(0, calculator.calculate("SUBSTRACTION", 2, 2));
    }

    @Test
    void failSubstraction() throws CalculatorException{
        assertNotEquals(3, calculator.calculate("SUBSTRACTION", 1, 1));
    }

}
