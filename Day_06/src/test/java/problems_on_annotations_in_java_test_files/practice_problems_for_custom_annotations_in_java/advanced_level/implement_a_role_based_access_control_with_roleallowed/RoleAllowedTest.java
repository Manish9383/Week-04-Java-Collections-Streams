package problems_on_annotations_in_java_test_files.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_role_based_access_control_with_roleallowed;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_role_based_access_control_with_roleallowed.AccessController;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_role_based_access_control_with_roleallowed.Role;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_role_based_access_control_with_roleallowed.SecureService;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class RoleAllowedTest {

    @Test
    void testAdminAccess() {
        SecureService service = new SecureService();
        AccessController accessController = new AccessController(Role.ADMIN);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        accessController.invokeMethod(service, "adminTask");

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Admin task executed successfully!"));
    }

    @Test
    void testUserAccessDenied() {
        SecureService service = new SecureService();
        AccessController accessController = new AccessController(Role.USER);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        accessController.invokeMethod(service, "adminTask");

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Access Denied! You need ADMIN role to access this method."));
    }
}
