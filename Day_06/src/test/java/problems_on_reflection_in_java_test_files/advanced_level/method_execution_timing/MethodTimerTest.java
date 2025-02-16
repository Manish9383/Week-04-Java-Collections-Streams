package problems_on_reflection_in_java_test_files.advanced_level.method_execution_timing;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.advanced_level.method_execution_timing.MethodTimer;
import problems_on_reflection_in_java.advanced_level.method_execution_timing.SampleOperations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MethodTimerTest {

    @Test
    void testMeasureExecutionTime() {
        SampleOperations sample = new SampleOperations();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        MethodTimer.measureExecutionTime(sample, "fastMethod");
        MethodTimer.measureExecutionTime(sample, "slowMethod");

        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("Execution time of fastMethod"));
        assertTrue(output.contains("Execution time of slowMethod"));
    }
}
