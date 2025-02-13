package filter_streams_convert_uppercase_to_lowercase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertCaseTest {

        private static final String INPUT_FILE = "src/main/resources/sample_text.txt";
        private static final String OUTPUT_FILE = "src/main/resources/converted_text.txt";

        @BeforeEach
        void setUp() throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE))) {
                writer.write("HELLO, THIS IS A SAMPLE TEXT FILE.\n");
                writer.write("JAVA IS FUN!\n");
                writer.write("BUFFERED READER AND WRITER ARE EFFICIENT.\n");
                writer.write("LET'S CONVERT THIS TO LOWERCASE.\n");
            }
        }

        @AfterEach
        void tearDown() {
            new File(INPUT_FILE).delete();
            new File(OUTPUT_FILE).delete();
        }

        @Test
        void testUppercaseToLowercaseConversion() {
            UppercaseToLowercaseConverter.convertFile(INPUT_FILE, OUTPUT_FILE);

            File outputFile = new File(OUTPUT_FILE);
            assertTrue(outputFile.exists(), "Output file should be created.");

            try (BufferedReader reader = new BufferedReader(new FileReader(OUTPUT_FILE))) {
                assertEquals("hello, this is a sample text file.", reader.readLine());
                assertEquals("java is fun!", reader.readLine());
                assertEquals("buffered reader and writer are efficient.", reader.readLine());
                assertEquals("let's convert this to lowercase.", reader.readLine());
                assertNull(reader.readLine());
            } catch (IOException e) {
                fail("Error reading output file: " + e.getMessage());
            }
        }
}
