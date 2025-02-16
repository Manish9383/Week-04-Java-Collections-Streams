package problems_on_annotations_in_java.exercise_5;


public class Main {
    public static void main(String[] args) {
        // Use Reflection to retrieve and process annotations
        AnnotationProcessor.processBugReports(IssueTracker.class);
    }
}
