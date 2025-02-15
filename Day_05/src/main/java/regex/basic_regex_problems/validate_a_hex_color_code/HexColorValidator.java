package regex.basic_regex_problems.validate_a_hex_color_code;


import java.util.regex.Pattern;

public class HexColorValidator {
    private static final String regex = "^#([A-Fa-f0-9]{6})$";

    public static boolean isValidHexColor(String color) {
        return Pattern.matches(regex, color);
    }
}
