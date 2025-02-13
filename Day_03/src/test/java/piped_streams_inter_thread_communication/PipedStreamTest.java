package piped_streams_inter_thread_communication;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class PipedStreamTest {

    @Test
    void testPipedStreamCommunication() throws IOException, InterruptedException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        ByteArrayOutputStream outputCapture = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputCapture));

        WriterThread writer = new WriterThread(pos);
        ReaderThread reader = new ReaderThread(pis);

        writer.start();
        reader.start();

        writer.join();
        reader.join();

        System.setOut(originalOut);

        String output = outputCapture.toString();
        assertTrue(output.contains("WriterThread: Writing message..."));
        assertTrue(output.contains("ReaderThread: Received message - Hello from WriterThread!"));
    }
}
