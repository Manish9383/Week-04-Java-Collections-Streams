package junit.advanced_junit_practice_problems.testing_user_registration;


import java.util.regex.Pattern;

public class UserRegistration {

    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    public static void registerUser(String username, String email, String password) {
        if (!Pattern.matches(USERNAME_PATTERN, username)) {
            throw new IllegalArgumentException("Invalid username. Must be 5-15 characters, start with a letter, and contain only letters, numbers, or underscores.");
        }
        if (!Pattern.matches(EMAIL_PATTERN, email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (!Pattern.matches(PASSWORD_PATTERN, password)) {
            throw new IllegalArgumentException("Weak password. Must be at least 8 characters, contain 1 uppercase letter, and 1 digit.");
        }
        System.out.println("User registered successfully!");
    }
}
