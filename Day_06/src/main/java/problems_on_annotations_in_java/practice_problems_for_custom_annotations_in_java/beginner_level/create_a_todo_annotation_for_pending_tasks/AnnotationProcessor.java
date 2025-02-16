package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_a_todo_annotation_for_pending_tasks;


import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void processTodos(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Pending Task in Method: " + method.getName());
                System.out.println("Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("-----------------------------");
            }
        }
    }
}
