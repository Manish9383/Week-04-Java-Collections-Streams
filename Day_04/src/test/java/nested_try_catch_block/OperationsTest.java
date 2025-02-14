package nested_try_catch_block;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {


    @Test
    void testGenerateException_DivideByZero() {
        int[] arr = {10, 20, 30, 40, 50};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        Operations.generateException(arr, 0, 2);

        assertTrue(outputStream.toString().contains("Cannot divide by zero!"));
    }

    @Test
    void testGenerateException_ValidInput() {
        int[] arr = {10, 20, 30, 40, 50};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Operations.generateException(arr, 2, 2);

        assertTrue(outputStream.toString().contains("Element at given index 2 is: 30"));
    }
}
