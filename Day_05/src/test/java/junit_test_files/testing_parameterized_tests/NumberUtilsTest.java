package junit_test_files.testing_parameterized_tests;


import static org.junit.jupiter.api.Assertions.*;

import junit.testing_parameterized_tests.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6}) // Testing even numbers
    void testIsEvenForEvenNumbers(int number) {
        assertTrue(NumberUtils.isEven(number), number + " should be even.");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9}) // Testing odd numbers
    void testIsEvenForOddNumbers(int number) {
        assertFalse(NumberUtils.isEven(number), number + " should be odd.");
    }
}
