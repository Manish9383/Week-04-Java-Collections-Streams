package problems_on_reflection_in_java.intermediate_level.access_and_modify_static_fields;


import java.lang.reflect.Field;

public class StaticFieldModifier {
    public static void modifyApiKey(String newApiKey) {
        try {
            Class<?> clazz = Configuration.class;
            Field apiKeyField = clazz.getDeclaredField("API_KEY");

            apiKeyField.setAccessible(true); // Bypass private access
            apiKeyField.set(null, newApiKey); // Modify static field (null because it's static)

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println("Error modifying static field: " + e.getMessage());
        }
    }
}
