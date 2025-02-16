package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_an_annotation_for_logging_method_execution_time;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime for reflection
@Target(ElementType.METHOD) // Apply only to methods
public @interface LogExecutionTime {
}
