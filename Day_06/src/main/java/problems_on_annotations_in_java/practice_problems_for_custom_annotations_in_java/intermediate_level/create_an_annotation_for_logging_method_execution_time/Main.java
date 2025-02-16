package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_an_annotation_for_logging_method_execution_time;


public class Main {
    public static void main(String[] args) {
        PerformanceTest test = new PerformanceTest();

        // Measure execution time of methods dynamically
        MethodTimer.measureExecutionTime(test);
    }
}
