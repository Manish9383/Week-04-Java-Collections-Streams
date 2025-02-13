package queue_interface.reverse_a_queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueReversalTest {

    private QueueReversal reversal;
    private Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        reversal = new QueueReversal();
        queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
    }

    @Test
    void testReverseQueue() {
        Queue<Integer> expectedQueue = new LinkedList<>();
        expectedQueue.add(30);
        expectedQueue.add(20);
        expectedQueue.add(10);

        reversal.reverseQueue(queue);

        assertEquals(expectedQueue, queue, "The queue was not reversed correctly.");
    }

    @Test
    void testReverseEmptyQueue() {
        Queue<Integer> emptyQueue = new LinkedList<>();
        reversal.reverseQueue(emptyQueue);

        assertTrue(emptyQueue.isEmpty(), "Reversed queue should still be empty.");
    }

    @Test
    void testReverseSingleElementQueue() {
        Queue<Integer> singleElementQueue = new LinkedList<>();
        singleElementQueue.add(42);

        reversal.reverseQueue(singleElementQueue);

        assertEquals(1, singleElementQueue.size());
        assertEquals(42, singleElementQueue.peek());
    }
}
