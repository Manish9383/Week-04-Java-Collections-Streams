package problems_on_reflection_in_java_test_files.advanced_level.dependency_injection_using_reflection;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.advanced_level.dependency_injection_using_reflection.DependencyInjector;
import problems_on_reflection_in_java.advanced_level.dependency_injection_using_reflection.UserService;

class DependencyInjectorTest {

    @Test
    void testDependencyInjection() {
        UserService userService = new UserService();

        // Inject dependencies
        DependencyInjector.injectDependencies(userService);

        assertNotNull(userService);
        assertDoesNotThrow(userService::useService); // Ensure it works without throwing an exception
    }
}
