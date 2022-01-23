package calculator;

import enums.Operations;
import interfaces.Operation;
import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Substraction;
import exception.CalculatorException;

import java.util.HashMap;

public class Calculator {
    private Operation addition = new Addition();
    private Operation substraction = new Substraction();
    private Operation multiplication = new Multiplication();
    private Operation division = new Division();
    private HashMap<Operations, Operation> ops = new HashMap();

    private Operations OPERATIONS;

    public Calculator() {
        ops.put(Operations.ADDITION, addition);
        ops.put(Operations.SUBSTRACTION, substraction);
        ops.put(Operations.MULTIPLICATION, multiplication);
        ops.put(Operations.DIVISION, division);
    }

    public double calculate(String operations, double a, double b) throws CalculatorException {
        if (a > 9) {
            throw new CalculatorException();
        }
        double result = 0;
        result = ops.get(Operations.valueOf(operations)).execute(a, b);
        return result;
    }

    private Operation getAddition() {
        return addition;
    }

    private Operation getSubstraction() {
        return substraction;
    }

    private Operation getMultiplication() {
        return multiplication;
    }

    private Operation getDivision() {
        return division;
    }

}
