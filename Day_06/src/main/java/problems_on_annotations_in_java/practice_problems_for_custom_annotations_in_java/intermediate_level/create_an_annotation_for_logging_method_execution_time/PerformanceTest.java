package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_an_annotation_for_logging_method_execution_time;


public class PerformanceTest {

    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Executing fast method...");
    }

    @LogExecutionTime
    public void slowMethod() {
        try {
            Thread.sleep(2000); // Simulate a slow operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Executing slow method...");
    }
}
