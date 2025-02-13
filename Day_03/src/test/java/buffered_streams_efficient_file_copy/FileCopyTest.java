package buffered_streams_efficient_file_copy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileCopyTest {
    private static final String SOURCE_FILE = "test_source.txt";
    private static final String DEST_FILE_STREAM = "test_dest_stream.txt";
    private static final String DEST_FILE_BUFFERED = "test_dest_buffered.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (FileWriter writer = new FileWriter(SOURCE_FILE)) {
            writer.write("This is a test file for copying.");
        }
    }

    @AfterEach
    void tearDown() {
        new File(SOURCE_FILE).delete();
        new File(DEST_FILE_STREAM).delete();
        new File(DEST_FILE_BUFFERED).delete();
    }

    @Test
    void testFileCopyUsingFileStream() {
        FileCopyUsingFileStream.fileMaker(SOURCE_FILE, DEST_FILE_STREAM);

        File copiedFile = new File(DEST_FILE_STREAM);
        assertTrue(copiedFile.exists(), "The file should be copied using file streams.");

        try (BufferedReader reader = new BufferedReader(new FileReader(DEST_FILE_STREAM))) {
            String content = reader.readLine();
            assertEquals("This is a test file for copying.", content, "File content should match.");
        } catch (IOException e) {
            fail("Failed to read the copied file.");
        }
    }

    @Test
    void testFileCopyUsingBufferedStreams() {
        FileCopyUsingBufferedStreams.fileMaker(SOURCE_FILE, DEST_FILE_BUFFERED);

        File copiedFile = new File(DEST_FILE_BUFFERED);
        assertTrue(copiedFile.exists(), "The file should be copied using buffered streams.");

        try (BufferedReader reader = new BufferedReader(new FileReader(DEST_FILE_BUFFERED))) {
            String content = reader.readLine();
            assertEquals("This is a test file for copying.", content, "File content should match.");
        } catch (IOException e) {
            fail("Failed to read the copied file.");
        }
    }

    @Test
    void testFileCopyWithNonExistentFile() {
        FileCopyUsingBufferedStreams.fileMaker("non_existing.txt", DEST_FILE_BUFFERED);
        File outputFile = new File(DEST_FILE_BUFFERED);
        assertFalse(outputFile.exists(), "The destination file should not be created if the source does not exist.");
    }
}
