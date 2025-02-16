package problems_on_reflection_in_java.intermediate_level.retrieve_annotations_at_runtime;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME) // Retain at runtime
@Target(ElementType.TYPE) // Apply to classes
public @interface Author {
    String name();
}
