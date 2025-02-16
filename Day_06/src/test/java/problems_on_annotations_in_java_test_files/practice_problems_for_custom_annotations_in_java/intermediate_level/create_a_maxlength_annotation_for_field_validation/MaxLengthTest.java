package problems_on_annotations_in_java_test_files.practice_problems_for_custom_annotations_in_java.intermediate_level.create_a_maxlength_annotation_for_field_validation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_a_maxlength_annotation_for_field_validation.User;

class MaxLengthTest {

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> new User("Manish"));
    }

    @Test
    void testInvalidUser() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new User("Manishpatel"));
        assertTrue(exception.getMessage().contains("Username exceeds maximum length of 10"));
    }
}
