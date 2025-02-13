package queue_interface.circular_buffer_simulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    private CircularBuffer buffer;

    @BeforeEach
    void setUp() {
        buffer = new CircularBuffer(3);  // Setting buffer size to 3
    }

    @Test
    void testEnqueueAndDisplay() {
        System.out.println("Testing enqueue and display...");

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.display();

        buffer.enqueue(4);
        buffer.display();
    }

    @Test
    void testDequeue() {
        System.out.println("Testing dequeue...");

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);

        System.out.println("Removed: " + buffer.dequeue());
        buffer.display();
    }

    @Test
    void testDequeueFromEmptyBuffer() {
        System.out.println("Testing dequeue from an empty buffer...");

        Exception exception = assertThrows(IllegalStateException.class, buffer::dequeue);
        System.out.println("Caught exception: " + exception.getMessage());
        assertEquals("Buffer is empty!", exception.getMessage());
    }

    @Test
    void testEnqueueAfterDequeue() {
        System.out.println("Testing enqueue after dequeue...");

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.dequeue();

        buffer.enqueue(4);
        buffer.display();
    }
}
