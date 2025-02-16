package problems_on_reflection_in_java.advanced_level.generate_a_json_representation;


import java.lang.reflect.Field;
import java.util.StringJoiner;

public class JsonSerializer {
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        Class<?> clazz = obj.getClass();
        StringJoiner json = new StringJoiner(", ", "{", "}");

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true); // Allow access to private fields
            try {
                Object value = field.get(obj);
                String valueStr = (value instanceof String) ? "\"" + value + "\"" : value.toString();
                json.add("\"" + field.getName() + "\": " + valueStr);
            } catch (IllegalAccessException e) {
                System.err.println("Error accessing field: " + field.getName());
            }
        }
        return json.toString();
    }
}
