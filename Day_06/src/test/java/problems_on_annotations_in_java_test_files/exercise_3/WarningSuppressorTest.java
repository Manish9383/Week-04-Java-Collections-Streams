package problems_on_annotations_in_java_test_files.exercise_3;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.exercise_3.WarningSuppressor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class WarningSuppressorTest {

    @Test
    void testAddElements() {
        WarningSuppressor ws = new WarningSuppressor();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ws.addElements();

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("List contains:"));
    }
}
