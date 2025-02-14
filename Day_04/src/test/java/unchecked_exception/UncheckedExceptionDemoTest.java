package unchecked_exception;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class UncheckedExceptionDemoTest {

    @Test
    void testGenerateException_DivideByZero() {
        String input = "10\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        UncheckedExceptionDemo.generateException();

        assertTrue(outputStream.toString().contains("Please give a valid denominator other than 0"));
    }
}
