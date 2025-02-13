package queue_interface.reverse_a_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        QueueReversal reversal = new QueueReversal();

        System.out.println("Original Queue: ");
        reversal.printQueue(queue);

        reversal.reverseQueue(queue);

        System.out.println("Reversed Queue: ");
        reversal.printQueue(queue);
    }
}
