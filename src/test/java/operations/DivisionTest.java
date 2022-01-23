package operations;

import calculator.Calculator;
import exception.CalculatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DivisionTest {
    private final Calculator calculator = new Calculator();

    @Test
    void passDivision() throws CalculatorException {
        assertEquals(1, calculator.calculate("DIVISION", 2, 2));
    }

    @Test
    void failDivision() throws CalculatorException{
        assertNotEquals(3, calculator.calculate("DIVISION", 1, 1));
    }

}
