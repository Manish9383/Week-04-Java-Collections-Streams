package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_an_annotation_to_mark_important_methods;


public class Main {
    public static void main(String[] args) {
        // Use Reflection to retrieve and process annotations
        AnnotationProcessor.processAnnotations(ServiceClass.class);
    }
}
