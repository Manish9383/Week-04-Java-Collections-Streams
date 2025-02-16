package problems_on_annotations_in_java_test_files.exercise_2;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.exercise_2.LegacyAPI;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LegacyAPITest {

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        api.newFeature();

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertEquals("This is the new and improved feature!", output);
    }
}
