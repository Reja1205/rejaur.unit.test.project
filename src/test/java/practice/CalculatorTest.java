package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(6, calculator.addition(3, 3));
    }

    @Test
    void subtraction() {
        Assertions.assertEquals(0, calculator.subtraction(3, 3));
    }

    @Test
    void multiplication() {
        assertEquals(9, calculator.multiplication(3, 3));
    }

    @Test
    void division() {
        assertEquals(0, calculator.division(3, 3));

    }
}