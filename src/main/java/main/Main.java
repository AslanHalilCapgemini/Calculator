package main;

import calculator.Calculator;
import exception.CalculatorException;

import java.util.Scanner;

public class Main {
    //TODO: De setat jenkins.
    //TODO: Debugging cu intellij si Maven
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        try {
            System.out.println(calculator.calculate(operation, a, b));
        } catch (CalculatorException ex) {
            System.out.println("Ai introdus o valoare mai mare de 9");
        }
    }
}
