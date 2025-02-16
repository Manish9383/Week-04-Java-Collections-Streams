package problems_on_reflection_in_java_test_files.advanced_level.custom_logging_proxy_using_reflection;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.advanced_level.custom_logging_proxy_using_reflection.Greeting;
import problems_on_reflection_in_java.advanced_level.custom_logging_proxy_using_reflection.HelloGreeting;
import problems_on_reflection_in_java.advanced_level.custom_logging_proxy_using_reflection.LoggingInvocationHandler;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LoggingProxyTest {

    @Test
    void testLoggingProxy() {
        // Capture system output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Greeting original = new HelloGreeting();
        Greeting proxy = LoggingInvocationHandler.createProxy(original, Greeting.class);

        proxy.sayHello();

        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("Executing method: sayHello"));
        assertTrue(output.contains("Hello, World!"));
    }
}
