package problems_on_reflection_in_java.advanced_level.dependency_injection_using_reflection;


import java.lang.reflect.Field;

public class DependencyInjector {

    public static void injectDependencies(Object obj) {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    Class<?> fieldType = field.getType();
                    Object dependency = fieldType.getDeclaredConstructor().newInstance();

                    field.setAccessible(true); // Allow private field modification
                    field.set(obj, dependency);

                } catch (Exception e) {
                    throw new RuntimeException("Error injecting dependencies", e);
                }
            }
        }
    }
}
