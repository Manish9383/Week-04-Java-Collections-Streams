package exception_propagation_in_methods;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testExceptionPropagation() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        Main.main(new String[]{});

        assertTrue(outputStream.toString().contains("Handled Exception in Main !!!"));
    }
}
