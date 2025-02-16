package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_role_based_access_control_with_roleallowed;


public class SecureService {

    @RoleAllowed(Role.ADMIN)
    public void adminTask() {
        System.out.println("Admin task executed successfully!");
    }

    @RoleAllowed(Role.USER)
    public void userTask() {
        System.out.println("User task executed successfully!");
    }

    public void openTask() {
        System.out.println("This task is open to everyone.");
    }
}
