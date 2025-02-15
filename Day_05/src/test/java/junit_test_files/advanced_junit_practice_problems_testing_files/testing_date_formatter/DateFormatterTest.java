package junit_test_files.advanced_junit_practice_problems_testing_files.testing_date_formatter;


import static org.junit.jupiter.api.Assertions.*;

import junit.advanced_junit_practice_problems.testing_date_formatter.DateFormatter;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    @Test
    void testValidDates() {
        assertEquals("15-08-2024", DateFormatter.formatDate("2024-08-15"), "Date should be formatted correctly.");
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"), "Date should be formatted correctly.");
        assertEquals("31-12-1999", DateFormatter.formatDate("1999-12-31"), "Date should be formatted correctly.");
    }

    @Test
    void testInvalidDates() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("15-08-2024"), "Invalid date format should throw exception.");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2024/08/15"), "Invalid separator should throw exception.");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2024-15-08"), "Invalid month should throw exception.");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("abcd-ef-gh"), "Completely invalid input should throw exception.");
    }
}
