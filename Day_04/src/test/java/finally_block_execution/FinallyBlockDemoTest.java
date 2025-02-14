package finally_block_execution;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class FinallyBlockDemoTest {

    @Test
    void testGenerateException_DivideByZero() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));
        System.setOut(new PrintStream(outputStream));

        FinallyBlockDemo.generateException(10, 0);

        String output = outputStream.toString();
        assertTrue(output.contains("Please give a valid denominator other than 0!!!"));
        assertTrue(output.contains("Operation Completed!"));
    }

    @Test
    void testGenerateException_ValidDivision() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        FinallyBlockDemo.generateException(10, 2);

        String output = outputStream.toString();
        assertTrue(output.contains("Result :5"));
        assertTrue(output.contains("Operation Completed!"));
    }
}
