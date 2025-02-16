package problems_on_reflection_in_java.intermediate_level.dynamic_method_invocation;


import java.lang.reflect.Method;

public class DynamicMethodInvoker {
    public static int invokeMethod(String methodName, int a, int b) {
        try {
            Class<?> clazz = MathOperations.class;
            Method method = clazz.getMethod(methodName, int.class, int.class);

            MathOperations mathOps = new MathOperations();
            return (int) method.invoke(mathOps, a, b);

        } catch (NoSuchMethodException e) {
            System.err.println("Method not found: " + methodName);
        } catch (Exception e) {
            System.err.println("Error invoking method: " + e.getMessage());
        }
        return -1;
    }
}
