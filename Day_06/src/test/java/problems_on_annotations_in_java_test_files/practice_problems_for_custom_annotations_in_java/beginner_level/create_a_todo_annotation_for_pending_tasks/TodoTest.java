package problems_on_annotations_in_java_test_files.practice_problems_for_custom_annotations_in_java.beginner_level.create_a_todo_annotation_for_pending_tasks;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_a_todo_annotation_for_pending_tasks.AnnotationProcessor;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_a_todo_annotation_for_pending_tasks.ProjectTasks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoTest {

    @Test
    void testProcessTodos() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        AnnotationProcessor.processTodos(ProjectTasks.class);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Pending Task in Method: loginFeature"));
        assertTrue(output.contains("Task: Implement login feature"));
        assertTrue(output.contains("Assigned To: Manish"));
        assertTrue(output.contains("Priority: HIGH"));

        assertTrue(output.contains("Pending Task in Method: optimizeQueries"));
        assertTrue(output.contains("Task: Optimize database queries"));
        assertTrue(output.contains("Assigned To: Raj"));
        assertTrue(output.contains("Priority: MEDIUM"));
    }
}
