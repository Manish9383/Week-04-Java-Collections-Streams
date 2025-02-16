package problems_on_reflection_in_java.advanced_level.custom_logging_proxy_using_reflection;


public class Main {
    public static void main(String[] args) {
        Greeting original = new HelloGreeting();

        // Create a dynamic proxy that logs method calls
        Greeting proxy = LoggingInvocationHandler.createProxy(original, Greeting.class);

        // Invoke the method through the proxy
        proxy.sayHello();
    }
}
