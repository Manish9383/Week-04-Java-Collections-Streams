package problems_on_annotations_in_java_test_files.exercise_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.exercise_5.AnnotationProcessor;
import problems_on_annotations_in_java.exercise_5.IssueTracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BugReportTest {

    @Test
    void testProcessBugReports() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        AnnotationProcessor.processBugReports(IssueTracker.class);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Method: processIssues"));
        assertTrue(output.contains("Bug Description: Null pointer exception on line 42"));
        assertTrue(output.contains("Reported By: Manish"));
        assertTrue(output.contains("Bug Description: Memory leak observed under high load"));
        assertTrue(output.contains("Reported By: Raj"));
    }
}
