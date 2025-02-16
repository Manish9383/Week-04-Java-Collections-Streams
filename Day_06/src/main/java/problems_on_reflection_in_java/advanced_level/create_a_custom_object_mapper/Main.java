package problems_on_reflection_in_java.advanced_level.create_a_custom_object_mapper;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Manish");
        properties.put("age", 23);
        properties.put("city", "Bhopal");

        // Convert Map to Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Display populated object
        person.display();
    }
}
