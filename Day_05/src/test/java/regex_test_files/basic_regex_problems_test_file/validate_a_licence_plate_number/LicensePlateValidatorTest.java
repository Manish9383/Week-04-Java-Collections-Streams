package regex_test_files.basic_regex_problems_test_file.validate_a_licence_plate_number;


import static org.junit.jupiter.api.Assertions.*;

import regex.basic_regex_problems.validate_a_licence_plate_number.LicensePlateValidator;
import org.junit.jupiter.api.Test;

class LicensePlateValidatorTest {

    @Test
    void testValidLicensePlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY9876"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("CD5678"));
    }

    @Test
    void testInvalidLicensePlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345")); // Only one letter
        assertFalse(LicensePlateValidator.isValidLicensePlate("ABC123")); // Three letters
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12A4")); // Contains non-digit
        assertFalse(LicensePlateValidator.isValidLicensePlate("ab1234")); // Lowercase letters
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB123"));  // Only three digits
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12345")); // More than four digits
    }
}
