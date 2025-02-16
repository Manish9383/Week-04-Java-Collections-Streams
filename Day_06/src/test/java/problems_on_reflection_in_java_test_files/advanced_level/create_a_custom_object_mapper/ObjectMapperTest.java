package problems_on_reflection_in_java_test_files.advanced_level.create_a_custom_object_mapper;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.advanced_level.create_a_custom_object_mapper.ObjectMapper;
import problems_on_reflection_in_java.advanced_level.create_a_custom_object_mapper.Person;

import java.util.HashMap;
import java.util.Map;

class ObjectMapperTest {

    @Test
    void testToObject() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Manish");
        properties.put("age", 22);
        properties.put("city", "Bhopal");

        Person person = ObjectMapper.toObject(Person.class, properties);

        assertNotNull(person);
    }
}
