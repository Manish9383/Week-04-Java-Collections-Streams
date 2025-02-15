package regex_test_files.basic_regex_problems_test_file.validate_a_user_name;



import static org.junit.jupiter.api.Assertions.*;

import regex.basic_regex_problems.validate_a_username.UsernameValidator;
import org.junit.jupiter.api.Test;

class UsernameValidatorTest {

    @Test
    void testValidUsernames() {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("UserTest"));
        assertTrue(UsernameValidator.isValidUsername("valid_567"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(UsernameValidator.isValidUsername("123user")); // Starts with number
        assertFalse(UsernameValidator.isValidUsername("us")); // Too short
        assertFalse(UsernameValidator.isValidUsername("thisisaverylongusername123")); // Too long
        assertFalse(UsernameValidator.isValidUsername("user@name")); // Invalid character
        assertFalse(UsernameValidator.isValidUsername("user space")); // Space not allowed
    }
}
