package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_a_todo_annotation_for_pending_tasks;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime for reflection
@Target(ElementType.METHOD) // Apply only to methods
public @interface Todo {
    String task(); // Description of the task
    String assignedTo(); // Developer responsible
    Priority priority() default Priority.MEDIUM; // Default priority level
}
