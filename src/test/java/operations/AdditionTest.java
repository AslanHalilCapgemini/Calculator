package operations;

import calculator.Calculator;
import exception.CalculatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdditionTest {
    private final Calculator calculator = new Calculator();

    @Test
    void passAddition() throws CalculatorException {
        assertEquals(2, calculator.calculate("ADDITION", 1, 1));
    }

    @Test
    void failAddition() throws CalculatorException {
        assertNotEquals(3, calculator.calculate("ADDITION", 1, 1));
    }


}
