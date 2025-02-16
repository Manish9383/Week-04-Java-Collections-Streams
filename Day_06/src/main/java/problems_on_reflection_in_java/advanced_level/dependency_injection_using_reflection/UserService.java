package problems_on_reflection_in_java.advanced_level.dependency_injection_using_reflection;

public class UserService {

    @Inject // Mark this field for dependency injection
    private Service service;

    public void useService() {
        service.serve();
    }
}
