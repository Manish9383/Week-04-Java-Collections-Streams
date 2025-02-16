package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_serialization_annotation_jsonfield;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime for reflection
@Target(ElementType.FIELD) // Apply only to fields
public @interface JsonField {
    String name(); // Custom JSON key name
}
