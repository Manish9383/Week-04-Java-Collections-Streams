package junit_test_files.advanced_junit_practice_problems_testing_files.testing_password_strength_validator;


import static org.junit.jupiter.api.Assertions.*;

import junit.advanced_junit_practice_problems.testing_password_strength_validator.PasswordValidator;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValidPassword("StrongP@ss1"), "Valid password should pass.");
        assertTrue(PasswordValidator.isValidPassword("Secure123x"), "Valid password should pass.");
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.isValidPassword("weak"), "Password should be at least 8 characters.");
        assertFalse(PasswordValidator.isValidPassword("NOLOWERCASE1"), "Password must contain a lowercase letter.");
        assertFalse(PasswordValidator.isValidPassword("nouppercase1"), "Password must contain an uppercase letter.");
        assertFalse(PasswordValidator.isValidPassword("NoDigitsHere!"), "Password must contain at least one digit.");
        assertFalse(PasswordValidator.isValidPassword(""), "Empty password should be invalid.");
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should be invalid.");
    }
}
