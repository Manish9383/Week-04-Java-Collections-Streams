package problems_on_reflection_in_java_test_files.intermediate_level.dynamic_method_invocation;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.intermediate_level.dynamic_method_invocation.DynamicMethodInvoker;

class DynamicMethodInvokerTest {

    @Test
    void testInvokeAdd() {
        int result = DynamicMethodInvoker.invokeMethod("add", 5, 3);
        assertEquals(8, result);
    }

    @Test
    void testInvokeSubtract() {
        int result = DynamicMethodInvoker.invokeMethod("subtract", 10, 4);
        assertEquals(6, result);
    }

    @Test
    void testInvokeMultiply() {
        int result = DynamicMethodInvoker.invokeMethod("multiply", 6, 7);
        assertEquals(42, result);
    }

    @Test
    void testInvokeInvalidMethod() {
        int result = DynamicMethodInvoker.invokeMethod("divide", 6, 3);
        assertEquals(-1, result);
    }
}
