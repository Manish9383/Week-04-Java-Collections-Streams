package regex_test_files.advanced_problems_test_files.validate_an_ip_address;


import static org.junit.jupiter.api.Assertions.*;

import regex.advanced_problems.validate_an_ip_address.IPAddressValidator;
import org.junit.jupiter.api.Test;

class IPAddressValidatorTest {

    @Test
    void testValidIPAddresses() {
        assertTrue(IPAddressValidator.isValidIPAddress("192.168.1.1"));
        assertTrue(IPAddressValidator.isValidIPAddress("10.0.0.1"));
        assertTrue(IPAddressValidator.isValidIPAddress("255.255.255.255"));
        assertTrue(IPAddressValidator.isValidIPAddress("0.0.0.0"));
    }

    @Test
    void testInvalidIPAddresses() {
        assertFalse(IPAddressValidator.isValidIPAddress("256.256.256.256")); // Out of range
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1")); // Missing one octet
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.01"));
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.999")); // Invalid number
        assertFalse(IPAddressValidator.isValidIPAddress("abc.def.ghi.jkl")); // Letters
        assertFalse(IPAddressValidator.isValidIPAddress("123.456.789.0")); // Out of range number
        assertFalse(IPAddressValidator.isValidIPAddress("192.168@1.1")); // Invalid character
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.1.1")); // Extra octet
    }
}
