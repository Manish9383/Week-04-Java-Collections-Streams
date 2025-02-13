package piped_streams_inter_thread_communication;

import java.io.IOException;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private final PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            System.out.println("WriterThread: Writing message...");
            outputStream.write(message.getBytes());
            outputStream.close();
        } catch (IOException e) {
            System.err.println("WriterThread Error: " + e.getMessage());
        }
    }
}