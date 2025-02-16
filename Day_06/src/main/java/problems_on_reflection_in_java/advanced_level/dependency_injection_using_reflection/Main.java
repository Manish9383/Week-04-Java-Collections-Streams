package problems_on_reflection_in_java.advanced_level.dependency_injection_using_reflection;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Inject dependencies using Reflection
        DependencyInjector.injectDependencies(userService);

        // Call method to check if Service was injected successfully
        userService.useService();
    }
}
