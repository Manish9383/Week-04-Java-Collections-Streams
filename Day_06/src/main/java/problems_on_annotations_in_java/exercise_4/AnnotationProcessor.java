package problems_on_annotations_in_java.exercise_4;


import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static String processAnnotations(Class<?> clazz) {
        StringBuilder output = new StringBuilder();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                output.append("Method: ").append(method.getName()).append("\n");
                output.append("Priority: ").append(taskInfo.priority()).append("\n");
                output.append("Assigned To: ").append(taskInfo.assignedTo()).append("\n");
                output.append("-----------------------------\n");
            }
        }
        System.out.println(output); // Ensure it prints the expected output
        return output.toString(); // Return for testing
    }
}
