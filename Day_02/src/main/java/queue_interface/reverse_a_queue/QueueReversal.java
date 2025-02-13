package queue_interface.reverse_a_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReversal {

    public void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();

        reverseQueue(queue);

        queue.add(front);
    }

    public void printQueue(Queue<Integer> queue) {
        System.out.println(queue);
    }
}
