package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_role_based_access_control_with_roleallowed;


import java.lang.reflect.Method;

public class AccessController {

    private final Role currentUserRole;

    public AccessController(Role currentUserRole) {
        this.currentUserRole = currentUserRole;
    }

    public void invokeMethod(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
                if (currentUserRole == annotation.value()) {
                    method.invoke(obj);
                } else {
                    System.out.println("Access Denied! You need " + annotation.value() + " role to access this method.");
                }
            } else {
                method.invoke(obj); // Execute if no restriction
            }
        } catch (Exception e) {
            System.err.println("Error executing method: " + e.getMessage());
        }
    }
}
