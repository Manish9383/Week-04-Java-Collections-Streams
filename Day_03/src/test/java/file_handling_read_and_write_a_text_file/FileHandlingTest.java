package file_handling_read_and_write_a_text_file;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlingTest {

    private static final String SOURCE_FILE = "test_input.txt";
    private static final String DEST_FILE = "demo.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (FileWriter writer = new FileWriter(SOURCE_FILE)) {
            writer.write("Hello, this is a test file.");
        }
    }

    @AfterEach
    void tearDown() {
        new File(SOURCE_FILE).delete();
        new File(DEST_FILE).delete();
    }

    @Test
    void testFileMaker() {
        FileHandling.fileMaker(SOURCE_FILE,DEST_FILE);

        File outputFile = new File(DEST_FILE);
        assertTrue(outputFile.exists(), "The output file should be created.");

        try (BufferedReader reader = new BufferedReader(new FileReader(DEST_FILE))) {
            String content = reader.readLine();
            assertEquals("Hello, this is a test file.", content, "File content should match.");
        } catch (IOException e) {
            fail("Reading the output file failed.");
        }
    }

}
