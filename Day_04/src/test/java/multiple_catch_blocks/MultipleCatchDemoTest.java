package multiple_catch_blocks;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class MultipleCatchDemoTest {

    @Test
    void testGenerateException_InvalidIndex() {
        int[] arr = {10, 15, 20, 30, 50, 20};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        MultipleCatchDemo.generateException(arr, 10);

        assertTrue(outputStream.toString().contains("Invalid index!"));
    }

    @Test
    void testGenerateException_NullArray() {
        int[] arr = null;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        MultipleCatchDemo.generateException(arr, 2);

        assertTrue(outputStream.toString().contains("Array is not initialized!"));
    }
}
