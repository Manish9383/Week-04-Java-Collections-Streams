package regex_test_files.advanced_problems_test_files.validate_a_social_security_number_ssn;


import static org.junit.jupiter.api.Assertions.*;

import regex.advanced_problems.validate_a_social_security_number_ssn.SSNValidator;
import org.junit.jupiter.api.Test;

class SSNValidatorTest {

    @Test
    void testValidSSN() {
        assertTrue(SSNValidator.isValidSSN("123-45-6789"));
        assertTrue(SSNValidator.isValidSSN("987-65-4321"));
    }

    @Test
    void testInvalidSSN() {
        assertFalse(SSNValidator.isValidSSN("123456789")); // Missing dashes
        assertFalse(SSNValidator.isValidSSN("12-345-6789")); // Incorrect grouping
        assertFalse(SSNValidator.isValidSSN("123-45-678")); // Too short
        assertFalse(SSNValidator.isValidSSN("abc-de-ghij")); // Letters instead of numbers
    }

    @Test
    void testExtractSSN() {
        assertEquals("123-45-6789", SSNValidator.extractSSN("My SSN is 123-45-6789."));
        assertEquals("987-65-4321", SSNValidator.extractSSN("SSN: 987-65-4321 is valid."));
    }

    @Test
    void testNoSSNFound() {
        assertNull(SSNValidator.extractSSN("No SSN here."));
    }
}
