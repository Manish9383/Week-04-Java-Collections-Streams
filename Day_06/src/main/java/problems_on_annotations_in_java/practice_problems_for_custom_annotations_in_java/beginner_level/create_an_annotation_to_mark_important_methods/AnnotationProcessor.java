package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_an_annotation_to_mark_important_methods;

import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void processAnnotations(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName());
                System.out.println("Level: " + annotation.level());
                System.out.println("-----------------------------");
            }
        }
    }
}
