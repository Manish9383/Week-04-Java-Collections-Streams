package checked_exception;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class CheckedExceptionDemoTest {

    @Test
    void testGenerateException_FileNotFound() {
        String invalidFilePath = "invalid/path.txt";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        CheckedExceptionDemo.generateException(invalidFilePath);

        assertTrue(outputStream.toString().contains("File not found!"));
    }
}
