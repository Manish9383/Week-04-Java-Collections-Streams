package queue_interface.circular_buffer_simulation;

import java.util.Arrays;

public class CircularBuffer {
    private int[] buffer;
    private int size;
    private int front;
    private int rear;
    private int count;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void enqueue(int value) {
        if (count == size) {
            System.out.println("Buffer is full. Overwriting oldest element: " + buffer[front]);
            front = (front + 1) % size;
        } else {
            count++;
        }

        buffer[rear] = value;
        rear = (rear + 1) % size;
    }

    public int dequeue() {
        if (count == 0) {
            throw new IllegalStateException("Buffer is empty!");
        }

        int removedValue = buffer[front];
        front = (front + 1) % size;
        count--;
        return removedValue;
    }

    public void display() {
        if (count == 0) {
            System.out.println("Buffer is empty.");
            return;
        }

        System.out.print("Circular Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }
}
