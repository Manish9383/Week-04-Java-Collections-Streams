package regex.basic_regex_problems.validate_a_licence_plate_number;


import java.util.regex.Pattern;

public class LicensePlateValidator {
    private static final String regex = "^[A-Z]{2}\\d{4}$";

    public static boolean isValidLicensePlate(String plate) {
        return Pattern.matches(regex, plate);
    }
}
