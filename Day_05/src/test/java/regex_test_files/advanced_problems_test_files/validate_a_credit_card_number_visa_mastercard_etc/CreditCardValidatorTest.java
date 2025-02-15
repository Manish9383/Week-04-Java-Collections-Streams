package regex_test_files.advanced_problems_test_files.validate_a_credit_card_number_visa_mastercard_etc;

import static org.junit.jupiter.api.Assertions.*;

import regex.advanced_problems.validate_a_credit_card_number_visa_mastercard_etc.CreditCardValidator;
import org.junit.jupiter.api.Test;

class CreditCardValidatorTest {

    @Test
    void testValidVisaCards() {
        assertTrue(CreditCardValidator.isValidVisa("4111111111111111")); // Valid Visa
        assertTrue(CreditCardValidator.isValidVisa("4000123456789012")); // Another valid Visa
    }

    @Test
    void testValidMasterCards() {
        assertTrue(CreditCardValidator.isValidMasterCard("5105105105105100")); // Valid MasterCard
        assertTrue(CreditCardValidator.isValidMasterCard("5201234567890123")); // Another valid MasterCard
    }

    @Test
    void testInvalidCards() {
        assertFalse(CreditCardValidator.isValidVisa("1234567812345678")); // Random 16 digits
        assertFalse(CreditCardValidator.isValidMasterCard("6011000990139424")); // Discover card
        assertFalse(CreditCardValidator.isValidVisa("4111-1111-1111-1111")); // Hyphens not allowed
        assertFalse(CreditCardValidator.isValidMasterCard("530000000000000000")); // Too long
        assertFalse(CreditCardValidator.isValidVisa("4abcdefghijklmno")); // Non-numeric
    }

    @Test
    void testGetCardType() {
        assertEquals("Visa", CreditCardValidator.getCardType("4111111111111111"));
        assertEquals("MasterCard", CreditCardValidator.getCardType("5105105105105100"));
        assertEquals("Invalid", CreditCardValidator.getCardType("1234567812345678"));
    }
}
