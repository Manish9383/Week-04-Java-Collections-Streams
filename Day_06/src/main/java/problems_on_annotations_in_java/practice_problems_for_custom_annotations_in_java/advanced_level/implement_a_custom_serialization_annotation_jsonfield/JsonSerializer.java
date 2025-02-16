package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_serialization_annotation_jsonfield;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    public static String toJson(Object obj) {
        Class<?> clazz = obj.getClass();
        Map<String, String> jsonMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                try {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String jsonKey = annotation.name();
                    String jsonValue = field.get(obj).toString();
                    jsonMap.put(jsonKey, jsonValue);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Error accessing field: " + field.getName(), e);
                }
            }
        }

        StringBuilder jsonString = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }

        // Remove last comma and space, then close JSON string
        if (jsonString.length() > 1) {
            jsonString.setLength(jsonString.length() - 2);
        }
        jsonString.append("}");

        return jsonString.toString();
    }
}
