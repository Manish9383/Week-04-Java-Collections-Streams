package problems_on_reflection_in_java.basic_level.dynamically_create_objects;


import java.lang.reflect.Constructor;

public class ObjectCreator {
    public static Student createStudentInstance(String name, int age) {
        try {
            Class<?> clazz = Student.class;

            // Get constructor with parameters
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

            // Create instance dynamically
            return (Student) constructor.newInstance(name, age);

        } catch (Exception e) {
            System.err.println("Error creating Student instance: " + e.getMessage());
        }
        return null;
    }
}
