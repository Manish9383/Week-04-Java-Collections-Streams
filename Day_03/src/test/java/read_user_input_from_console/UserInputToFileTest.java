package read_user_input_from_console;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class UserInputToFileTest {

    private static final String TEST_FILE = "src/main/resources/UserDetailsTest.txt";
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    void setUp() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
        new File(TEST_FILE).delete();
    }

    @Test
    void testCreateFileWithMockInput() throws IOException {
        String simulatedInput = "Raj\n25\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        UserInputToFile.createFile(TEST_FILE);

        String consoleOutput = testOut.toString();
        assertTrue(consoleOutput.contains("User data saved successfully"));

        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "The file should be created.");

        try (BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE))) {
            assertEquals("Name: Raj", reader.readLine());
            assertEquals("Age: 25", reader.readLine());
            assertEquals("Favorite Language: Java", reader.readLine());
        }
    }
}
