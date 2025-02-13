package queue_interface.implement_a_stack_using_queues;

public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);


        stack.printStack();

        System.out.println("Popped Element: " + stack.pop());

        stack.printStack();

        System.out.println("Top Element: " + stack.top());

        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}
