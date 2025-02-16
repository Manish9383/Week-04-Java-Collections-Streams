package problems_on_annotations_in_java_test_files.practice_problems_for_custom_annotations_in_java.intermediate_level.create_an_annotation_for_logging_method_execution_time;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_an_annotation_for_logging_method_execution_time.MethodTimer;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_an_annotation_for_logging_method_execution_time.PerformanceTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LogExecutionTimeTest {

    @Test
    void testMeasureExecutionTime() {
        PerformanceTest test = new PerformanceTest();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        MethodTimer.measureExecutionTime(test);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Execution time of fastMethod"));
        assertTrue(output.contains("Execution time of slowMethod"));
    }
}
