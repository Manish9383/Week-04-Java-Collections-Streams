package custom_exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionDemoTest {

    @Test
    void testValidateAge_ThrowsInvalidAgeException() {
        InvalidAgeException exception = assertThrows(InvalidAgeException.class, () -> {
            CustomExceptionDemo.validateAge(16);
        });

        assertEquals("Age must be 18 0r above!", exception.getMessage());
    }

    @Test
    void testValidateAge_NoExceptionForValidAge() {
        assertDoesNotThrow(() -> CustomExceptionDemo.validateAge(20));
    }
}
