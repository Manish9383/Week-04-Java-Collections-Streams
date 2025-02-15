package junit.advanced_junit_practice_problems.testing_password_strength_validator;


import java.util.regex.Pattern;

public class PasswordValidator {

    // Updated regex to enforce lowercase letter requirement
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";

    // Validates the password
    public static boolean isValidPassword(String password) {
        return password != null && Pattern.matches(PASSWORD_PATTERN, password);
    }
}
