package junit_test_files.testing_exception_handling;


import static org.junit.jupiter.api.Assertions.*;

import junit.testing_exception_handling.MathOperations;
import org.junit.jupiter.api.Test;

class MathOperationsTest {

    @Test
    void testDivisionByNonZero() {
        assertEquals(2.0, MathOperations.divide(10, 5));
        assertEquals(-2.5, MathOperations.divide(-5, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> MathOperations.divide(10, 0));
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
