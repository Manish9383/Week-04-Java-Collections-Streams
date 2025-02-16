package problems_on_reflection_in_java.basic_level.invoke_private_method;


import java.lang.reflect.Method;

public class PrivateMethodInvoker {
    public static int invokeMultiply(Calculator calculator, int a, int b) {
        try {
            Class<?> clazz = calculator.getClass();
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);

            multiplyMethod.setAccessible(true); // Bypass private access
            return (int) multiplyMethod.invoke(calculator, a, b);

        } catch (Exception e) {
            System.err.println("Error invoking private method: " + e.getMessage());
        }
        return -1;
    }
}
