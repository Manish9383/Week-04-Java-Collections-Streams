package junit_test_files.testing_file_handling_methods;


import static org.junit.jupiter.api.Assertions.*;

import junit.testing_file_handling_methods.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Ensure file is clean before each test
        Files.deleteIfExists(Path.of(TEST_FILE));
    }

    @Test
    void testWriteToFileAndRead() throws IOException {
        String content = "Hello, JUnit File Handling!";
        FileProcessor.writeToFile(TEST_FILE, content);

        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing.");

        String readContent = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "Content should match what was written.");
    }

    @Test
    void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"),
                "Reading a non-existent file should throw IOException.");
    }

    @AfterEach
    void tearDown() throws IOException {
        // Clean up after tests
        Files.deleteIfExists(Path.of(TEST_FILE));
    }
}
