package try_with_resources;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class TryWithResourcesDemoTest {

    @Test
    void testGenerateException_FileNotFound() {
        String invalidFilePath = "invalid/path.txt";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        TryWithResourcesDemo.generateException(invalidFilePath);

        assertTrue(outputStream.toString().contains("Error reading file!"));
    }
}
