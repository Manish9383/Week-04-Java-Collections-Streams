package problems_on_reflection_in_java.intermediate_level.retrieve_annotations_at_runtime;

public class Main {
    public static void main(String[] args) {
        // Retrieve annotation value using Reflection
        AnnotationProcessor.processAnnotations(Book.class);
    }
}
