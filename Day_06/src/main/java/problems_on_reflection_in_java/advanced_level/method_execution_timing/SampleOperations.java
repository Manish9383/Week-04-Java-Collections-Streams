package problems_on_reflection_in_java.advanced_level.method_execution_timing;


public class SampleOperations {

    public void fastMethod() {
        System.out.println("Executing fast method...");
    }

    public void slowMethod() {
        try {
            Thread.sleep(2000); // Simulate a slow operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Executing slow method...");
    }
}
