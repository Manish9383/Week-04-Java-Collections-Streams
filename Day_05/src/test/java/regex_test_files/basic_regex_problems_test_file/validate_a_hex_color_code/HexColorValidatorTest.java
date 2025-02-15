package regex_test_files.basic_regex_problems_test_file.validate_a_hex_color_code;

import static org.junit.jupiter.api.Assertions.*;

import regex.basic_regex_problems.validate_a_hex_color_code.HexColorValidator;
import org.junit.jupiter.api.Test;

class HexColorValidatorTest {

    @Test
    void testValidHexColors() {
        assertTrue(HexColorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexColorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexColorValidator.isValidHexColor("#123ABC"));
        assertTrue(HexColorValidator.isValidHexColor("#abcdef"));
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(HexColorValidator.isValidHexColor("#123")); // Too short
        assertFalse(HexColorValidator.isValidHexColor("#GGGGGG")); // Invalid characters
        assertFalse(HexColorValidator.isValidHexColor("FFA500")); // Missing #
        assertFalse(HexColorValidator.isValidHexColor("#1234567")); // Too long
    }
}
