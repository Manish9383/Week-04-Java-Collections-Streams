package problems_on_annotations_in_java_test_files.practice_problems_for_custom_annotations_in_java.beginner_level.create_an_annotation_to_mark_important_methods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_an_annotation_to_mark_important_methods.AnnotationProcessor;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_an_annotation_to_mark_important_methods.ServiceClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ImportantMethodTest {

    @Test
    void testProcessAnnotations() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        AnnotationProcessor.processAnnotations(ServiceClass.class);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Important Method: processData"));
        assertTrue(output.contains("Level: HIGH"));
        assertTrue(output.contains("Important Method: generateReport"));
        assertTrue(output.contains("Level: MEDIUM"));
    }
}
