package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_role_based_access_control_with_roleallowed;


public class Main {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        System.out.println("Testing as ADMIN:");
        AccessController adminAccess = new AccessController(Role.ADMIN);
        adminAccess.invokeMethod(service, "adminTask");
        adminAccess.invokeMethod(service, "userTask");
        adminAccess.invokeMethod(service, "openTask");

        System.out.println("\nTesting as USER:");
        AccessController userAccess = new AccessController(Role.USER);
        userAccess.invokeMethod(service, "adminTask");
        userAccess.invokeMethod(service, "userTask");
        userAccess.invokeMethod(service, "openTask");

        System.out.println("\nTesting as GUEST:");
        AccessController guestAccess = new AccessController(Role.GUEST);
        guestAccess.invokeMethod(service, "adminTask");
        guestAccess.invokeMethod(service, "userTask");
        guestAccess.invokeMethod(service, "openTask");
    }
}
