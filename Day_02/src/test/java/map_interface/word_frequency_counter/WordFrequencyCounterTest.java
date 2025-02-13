package map_interface.word_frequency_counter;


import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void testCountWordFrequency() throws IOException {
        System.out.println("Testing countWordFrequency method...");

        File tempFile = File.createTempFile("testfile", ".txt");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello world\n");
            writer.write("Hello there\n");
            writer.write("world of Java\n");
        }

        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> wordFrequencies = counter.countWordFrequency(tempFile.getAbsolutePath());

        Map<String, Integer> expectedWordFrequencies = Map.of(
                "hello", 2,
                "world", 2,
                "there", 1,
                "of", 1,
                "java", 1
        );

        System.out.println("Word Frequencies: " + wordFrequencies);
        assertEquals(expectedWordFrequencies, wordFrequencies, "The word frequencies are not correct.");
    }

    @Test
    void testEmptyFile() throws IOException {
        System.out.println("Testing empty file...");

        File tempFile = File.createTempFile("emptyfile", ".txt");
        tempFile.deleteOnExit();

        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> wordFrequencies = counter.countWordFrequency(tempFile.getAbsolutePath());

        assertTrue(wordFrequencies.isEmpty(), "The word frequencies map should be empty for an empty file.");
        System.out.println("Word Frequencies for empty file: " + wordFrequencies);
    }

    @Test
    void testFileWithSpecialCharacters() throws IOException {
        System.out.println("Testing file with special characters...");

        File tempFile = File.createTempFile("specialCharsFile", ".txt");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello, world! Hello... world.\n");
        }

        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> wordFrequencies = counter.countWordFrequency(tempFile.getAbsolutePath());

        Map<String, Integer> expectedWordFrequencies = Map.of(
                "hello", 2,
                "world", 2
        );

        System.out.println("Word Frequencies: " + wordFrequencies);
        assertEquals(expectedWordFrequencies, wordFrequencies, "The word frequencies with special characters are not correct.");
    }
}
