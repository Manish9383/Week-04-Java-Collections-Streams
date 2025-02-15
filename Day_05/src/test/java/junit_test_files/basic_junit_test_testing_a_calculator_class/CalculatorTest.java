package junit_test_files.basic_junit_test_testing_a_calculator_class;


import static org.junit.jupiter.api.Assertions.*;

import junit.basic_junit_test_testing_a_calculator_class.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(3, -3));
    }

    @Test
    void testSubtraction() {
        assertEquals(3, calculator.subtract(8, 5));
        assertEquals(-10, calculator.subtract(-5, 5));
        assertEquals(0, calculator.subtract(4, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(-15, calculator.multiply(-3, 5));
        assertEquals(0, calculator.multiply(0, 10));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5));
        assertEquals(-2.5, calculator.divide(-5, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
