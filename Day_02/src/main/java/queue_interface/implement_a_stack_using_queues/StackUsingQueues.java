package queue_interface.implement_a_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return q1.remove();
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void printStack() {
        System.out.println("Current Stack: " + q1);
    }
}
