package throw_vs_throws;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionPropagationTest {

    @Test
    void testCalculateInterest_InvalidInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ExceptionPropagation.calculateInterest(-1000, 5, 2); // Negative amount
        });

        assertNull(exception.getMessage());
    }

    @Test
    void testCalculateInterest_ValidInput() {
        assertDoesNotThrow(() -> ExceptionPropagation.calculateInterest(1000, 5, 2)); // Valid case
    }
}
