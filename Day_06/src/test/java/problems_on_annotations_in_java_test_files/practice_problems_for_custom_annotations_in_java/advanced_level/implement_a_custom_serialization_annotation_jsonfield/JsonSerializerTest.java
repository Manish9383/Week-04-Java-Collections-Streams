package problems_on_annotations_in_java_test_files.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_serialization_annotation_jsonfield;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_serialization_annotation_jsonfield.JsonSerializer;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_serialization_annotation_jsonfield.User;

class JsonSerializerTest {

    @Test
    void testJsonSerialization() {
        User user = new User("Manu123", 25, "secretPassword");
        String json = JsonSerializer.toJson(user);

        assertTrue(json.contains("\"user_name\": \"Manu123\""));
        assertTrue(json.contains("\"user_age\": \"25\""));
        assertFalse(json.contains("password")); // Ensure password is not included
    }
}
