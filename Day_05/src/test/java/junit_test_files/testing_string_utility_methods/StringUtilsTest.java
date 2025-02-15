package junit_test_files.testing_string_utility_methods;

import static org.junit.jupiter.api.Assertions.*;

import junit.testing_string_utility_methods.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("madam", StringUtils.reverse("madam")); // Palindrome case
        assertEquals("", StringUtils.reverse("")); // Empty string
        assertNull(StringUtils.reverse(null)); // Null case
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("Racecar")); // Case insensitive
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null)); // Null case
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("WORLD", StringUtils.toUpperCase("WORLD")); // Already uppercase
        assertEquals("", StringUtils.toUpperCase("")); // Empty string
        assertNull(StringUtils.toUpperCase(null)); // Null case
    }
}
