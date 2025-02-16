package problems_on_reflection_in_java_test_files.advanced_level.generate_a_json_representation;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.advanced_level.generate_a_json_representation.JsonPerson;
import problems_on_reflection_in_java.advanced_level.generate_a_json_representation.JsonSerializer;

class JsonSerializerTest {

    @Test
    void testToJson() {
        JsonPerson person = new JsonPerson("Manu", 25, "Pune");
        String json = JsonSerializer.toJson(person);

        assertTrue(json.contains("\"name\": \"Manu\""));
        assertTrue(json.contains("\"age\": 25"));
        assertTrue(json.contains("\"city\": \"Pune\""));
    }
}
