package queue_interface.circular_buffer_simulation;

public class Main {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.display();


        buffer.enqueue(4);
        buffer.display();


        System.out.println("Removed: " + buffer.dequeue());
        buffer.display();

        buffer.enqueue(5);
        buffer.display();


        buffer.enqueue(6);
        buffer.display();
    }
}
