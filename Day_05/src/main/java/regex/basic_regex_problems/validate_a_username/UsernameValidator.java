package regex.basic_regex_problems.validate_a_username;


import java.util.regex.Pattern;

public class UsernameValidator {
    private static final String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

    public static boolean isValidUsername(String username) {
        return Pattern.matches(regex, username);
    }
}
