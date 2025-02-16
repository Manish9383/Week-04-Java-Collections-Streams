package problems_on_reflection_in_java.advanced_level.method_execution_timing;


import java.lang.reflect.Method;

public class MethodTimer {

    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Class<?> clazz = obj.getClass();
            Method method = clazz.getMethod(methodName);

            long startTime = System.nanoTime();
            method.invoke(obj); // Invoke the method dynamically
            long endTime = System.nanoTime();

            long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
            System.out.println("Execution time of " + methodName + ": " + executionTime + " ms");

        } catch (Exception e) {
            System.err.println("Error executing method: " + e.getMessage());
        }
    }
}
