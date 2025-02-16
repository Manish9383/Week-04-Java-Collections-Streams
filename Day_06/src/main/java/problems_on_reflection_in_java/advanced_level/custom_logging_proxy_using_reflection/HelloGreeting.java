package problems_on_reflection_in_java.advanced_level.custom_logging_proxy_using_reflection;


public class HelloGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}
