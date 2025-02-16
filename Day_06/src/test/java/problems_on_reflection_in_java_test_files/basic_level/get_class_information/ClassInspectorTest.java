package problems_on_reflection_in_java_test_files.basic_level.get_class_information;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.basic_level.get_class_information.ClassInspector;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ClassInspectorTest {

    @Test
    void testInspectClass() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ClassInspector.inspectClass("java.lang.String");

        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("Class Name: java.lang.String"));
        assertTrue(output.contains("Method"));
        assertTrue(output.contains("Constructor"));
    }
}
