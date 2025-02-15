package regex.advanced_problems.validate_a_social_security_number_ssn;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SSNValidator {
    private static final String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

    public static boolean isValidSSN(String ssn) {
        return Pattern.matches(regex, ssn);
    }

    public static String extractSSN(String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group(); // Return the first valid SSN found
        }
        return null;
    }
}
