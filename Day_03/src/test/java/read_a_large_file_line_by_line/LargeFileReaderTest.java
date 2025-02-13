package read_a_large_file_line_by_line;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeFileReaderTest {
    private Path tempFile;

    @BeforeEach
    void setUp() throws IOException {
        tempFile = Files.createTempFile("test_large_file", ".txt");

        List<String> lines = List.of(
                "INFO: System started successfully.",
                "WARNING: Disk space running low.",
                "ERROR: Unable to connect to database.",
                "DEBUG: User login attempt.",
                "error: File not found in the specified directory.",
                "INFO: Scheduled backup completed.",
                "WARNING: High memory usage detected."
        );

        Files.write(tempFile, lines, StandardOpenOption.WRITE);
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    @Test
    void testReadAndFilterErrors() throws IOException {
        List<String> filteredLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    filteredLines.add(line);
                }
            }
        }

        List<String> expectedLines = List.of(
                "ERROR: Unable to connect to database.",
                "error: File not found in the specified directory."
        );

        assertEquals(expectedLines, filteredLines, "Filtered lines do not match expected output.");
    }
}
