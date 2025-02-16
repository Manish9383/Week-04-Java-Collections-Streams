package problems_on_reflection_in_java.basic_level.access_private_field;


import java.lang.reflect.Field;

public class PrivateFieldAccessor {
    public static void modifyAge(Person person, int newAge) {
        try {
            Class<?> clazz = person.getClass();
            Field ageField = clazz.getDeclaredField("age");

            ageField.setAccessible(true); // Bypass private access
            ageField.set(person, newAge); // Modify private field

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println("Error accessing private field: " + e.getMessage());
        }
    }

    public static int getAge(Person person) {
        try {
            Class<?> clazz = person.getClass();
            Field ageField = clazz.getDeclaredField("age");

            ageField.setAccessible(true); // Bypass private access
            return ageField.getInt(person); // Retrieve private field value

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println("Error retrieving private field: " + e.getMessage());
        }
        return -1;
    }
}
