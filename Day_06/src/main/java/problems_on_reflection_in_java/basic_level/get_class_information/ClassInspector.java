package problems_on_reflection_in_java.basic_level.get_class_information;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInspector {
    public static void inspectClass(String className) {
        try {
            Class<?> clazz = Class.forName(className);

            System.out.println("Class Name: " + clazz.getName());

            System.out.println("\n--- Constructors ---");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            System.out.println("\n--- Methods ---");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            System.out.println("\n--- Fields ---");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        }
    }
}
