package queue_interface.implement_a_stack_using_queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {

    private StackUsingQueues stack;



    @Test
    void testPushAndTop() {
        System.out.println("Testing push and top functionality...");

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // Display current stack state

        assertEquals(30, stack.top(), "Top element should be 30.");
        System.out.println("✔ Top element is: " + stack.top());
    }

    @Test
    void testPop() {
        System.out.println("Testing pop functionality...");

        stack.push(5);
        stack.push(15);
        stack.push(25);

        stack.printStack();

        int popped = stack.pop();
        System.out.println("✔ Popped element: " + popped);
        assertEquals(25, popped);

        stack.printStack();
        assertEquals(15, stack.top(), "Top element should be 15 after popping 25.");
        System.out.println("✔ New top element is: " + stack.top());
    }

    @Test
    void testIsEmpty() {
        System.out.println("Testing isEmpty functionality...");

        assertTrue(stack.isEmpty(), "Stack should be empty initially.");
        System.out.println("✔ Stack is initially empty.");

        stack.push(100);
        stack.printStack();
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element.");
        System.out.println("✔ Stack is not empty after pushing an element.");

        stack.pop();
        stack.printStack();
        assertTrue(stack.isEmpty(), "Stack should be empty after popping the only element.");
        System.out.println("✔ Stack is empty after popping the last element.");
    }

    @Test
    void testPopFromEmptyStack() {
        System.out.println("Testing pop on an empty stack...");

        Exception exception = assertThrows(IllegalStateException.class, stack::pop);
        System.out.println("✔ Caught Exception: " + exception.getMessage());
        assertEquals("Stack is empty!", exception.getMessage());
    }

    @Test
    void testTopFromEmptyStack() {
        System.out.println("Testing top on an empty stack...");

        Exception exception = assertThrows(IllegalStateException.class, stack::top);
        System.out.println("✔ Caught Exception: " + exception.getMessage());
        assertEquals("Stack is empty!", exception.getMessage());
    }
}
