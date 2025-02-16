package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_a_maxlength_annotation_for_field_validation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime for reflection
@Target(ElementType.FIELD) // Apply only to fields
public @interface MaxLength {
    int value(); // Maximum length for the field
}
