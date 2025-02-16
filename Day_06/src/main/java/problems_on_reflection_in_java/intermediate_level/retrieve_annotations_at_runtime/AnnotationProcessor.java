package problems_on_reflection_in_java.intermediate_level.retrieve_annotations_at_runtime;


import java.lang.annotation.Annotation;

public class AnnotationProcessor {
    public static void processAnnotations(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Author.class)) {
            // Retrieve annotation
            Annotation annotation = clazz.getAnnotation(Author.class);
            Author author = (Author) annotation;

            // Display annotation value
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}
