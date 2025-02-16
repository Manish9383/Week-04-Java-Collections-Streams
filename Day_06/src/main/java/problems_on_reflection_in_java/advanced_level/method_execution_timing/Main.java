package problems_on_reflection_in_java.advanced_level.method_execution_timing;


public class Main {
    public static void main(String[] args) {
        SampleOperations sample = new SampleOperations();

        // Measure execution time of methods dynamically
        MethodTimer.measureExecutionTime(sample, "fastMethod");
        MethodTimer.measureExecutionTime(sample, "slowMethod");
    }
}
