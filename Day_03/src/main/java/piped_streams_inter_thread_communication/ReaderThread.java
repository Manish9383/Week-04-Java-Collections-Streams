package piped_streams_inter_thread_communication;

import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private final PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("ReaderThread: Received message - " + receivedMessage);
            inputStream.close();
        } catch (IOException e) {
            System.err.println("ReaderThread Error: " + e.getMessage());
        }
    }
}
