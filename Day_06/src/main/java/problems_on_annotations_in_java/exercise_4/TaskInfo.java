package problems_on_annotations_in_java.exercise_4;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Ensure the annotation is available at runtime
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
    Priority priority() default Priority.MEDIUM;
    String assignedTo();
}
