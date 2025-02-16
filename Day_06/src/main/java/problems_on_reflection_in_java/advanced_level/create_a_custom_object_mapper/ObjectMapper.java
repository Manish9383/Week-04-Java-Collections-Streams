package problems_on_reflection_in_java.advanced_level.create_a_custom_object_mapper;


import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance(); // Create an instance using default constructor

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                try {
                    Field field = clazz.getDeclaredField(entry.getKey());
                    field.setAccessible(true); // Allow access to private fields
                    field.set(instance, entry.getValue());
                } catch (NoSuchFieldException e) {
                    System.err.println("No field found: " + entry.getKey());
                }
            }
            return instance;

        } catch (Exception e) {
            throw new RuntimeException("Error creating object: " + e.getMessage(), e);
        }
    }
}
