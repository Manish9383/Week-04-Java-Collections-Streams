package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_an_annotation_for_logging_method_execution_time;


import java.lang.reflect.Method;

public class MethodTimer {

    public static void measureExecutionTime(Object obj) {
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    long startTime = System.nanoTime();
                    method.invoke(obj); // Invoke the method dynamically
                    long endTime = System.nanoTime();

                    long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
                    System.out.println("Execution time of " + method.getName() + ": " + executionTime + " ms");

                } catch (Exception e) {
                    System.err.println("Error executing method: " + method.getName() + " - " + e.getMessage());
                }
            }
        }
    }
}
