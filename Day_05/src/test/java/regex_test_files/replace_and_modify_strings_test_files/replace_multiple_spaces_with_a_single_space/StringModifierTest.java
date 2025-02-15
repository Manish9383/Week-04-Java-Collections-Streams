package regex_test_files.replace_and_modify_strings_test_files.replace_multiple_spaces_with_a_single_space;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space.StringModifier;

class StringModifierTest {

    @Test
    void testReplaceMultipleSpaces() {
        assertEquals("This is an example with multiple spaces.",
                StringModifier.replaceMultipleSpaces("This   is    an  example  with    multiple   spaces."));

        assertEquals("Hello World", StringModifier.replaceMultipleSpaces("Hello     World"));
        assertEquals("Java is fun", StringModifier.replaceMultipleSpaces("  Java    is   fun  "));
        assertEquals("No extra spaces", StringModifier.replaceMultipleSpaces("No extra spaces"));
        assertEquals("", StringModifier.replaceMultipleSpaces("      ")); // Empty string case
    }
}
