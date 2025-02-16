package problems_on_annotations_in_java_test_files.exercise_4;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.exercise_4.AnnotationProcessor;
import problems_on_annotations_in_java.exercise_4.TaskManager;

class TaskInfoTest {

    @Test
    void testProcessAnnotations() {
        String output = AnnotationProcessor.processAnnotations(TaskManager.class);

        assertTrue(output.contains("Method: deployFeature"));
        assertTrue(output.contains("Priority: HIGH"));
        assertTrue(output.contains("Assigned To: Manish"));
        assertTrue(output.contains("Method: cleanUpLogs"));
        assertTrue(output.contains("Priority: LOW"));
        assertTrue(output.contains("Assigned To: Raj"));
    }
}
