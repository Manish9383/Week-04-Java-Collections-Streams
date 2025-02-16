package problems_on_reflection_in_java_test_files.basic_level.invoke_private_method;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.basic_level.invoke_private_method.Calculator;
import problems_on_reflection_in_java.basic_level.invoke_private_method.PrivateMethodInvoker;

class PrivateMethodInvokerTest {

    @Test
    void testInvokeMultiply() {
        Calculator calculator = new Calculator();

        // Invoke multiply method using Reflection
        int result = PrivateMethodInvoker.invokeMultiply(calculator, 4, 5);

        // Verify the result
        assertEquals(20, result);
    }
}
