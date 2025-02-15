package junit_test_files.advanced_junit_practice_problems_testing_files.testing_user_registration;


import static org.junit.jupiter.api.Assertions.*;

import junit.advanced_junit_practice_problems.testing_user_registration.UserRegistration;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("User_123", "test@example.com", "Password1"), "Valid user should register successfully.");
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("123User", "test@example.com", "Password1"), "Username should start with a letter.");
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Us", "test@example.com", "Password1"), "Username should be at least 5 characters.");
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("VeryLongUsername123", "test@example.com", "Password1"), "Username should be at most 15 characters.");
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "invalid-email", "Password1"), "Invalid email format should fail.");
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "test@com", "Password1"), "Missing domain part in email.");
    }

    @Test
    void testWeakPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "test@example.com", "weak"), "Password should be at least 8 characters.");
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "test@example.com", "nouppercase1"), "Password must contain an uppercase letter.");
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "test@example.com", "NoDigitsHere"), "Password must contain at least one digit.");
    }
}
