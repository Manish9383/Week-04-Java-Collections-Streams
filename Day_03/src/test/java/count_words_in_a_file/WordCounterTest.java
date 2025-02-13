package count_words_in_a_file;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordCounterTest {
    @Test
    void testCountWords() throws IOException {
        Path tempFile = Files.createTempFile("test", ".txt");
        Files.writeString(tempFile, "Java Java error error test");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        WordCounter.countWords(tempFile.toString());

        String output = outputStream.toString().toLowerCase();
        assertTrue(output.contains("java: 2"));
        assertTrue(output.contains("error: 2"));
        assertTrue(output.contains("test: 1"));

        Files.delete(tempFile);
        System.setOut(System.out);
    }
}
