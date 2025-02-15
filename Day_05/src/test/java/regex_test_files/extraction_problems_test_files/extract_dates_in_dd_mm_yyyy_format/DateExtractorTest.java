package regex_test_files.extraction_problems_test_files.extract_dates_in_dd_mm_yyyy_format;

import static org.junit.jupiter.api.Assertions.*;

import regex.extraction_problems.extract_dates_in_dd_mm_yyyy_format.DateExtractor;
import org.junit.jupiter.api.Test;

import java.util.List;

class DateExtractorTest {

    @Test
    void testValidDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = DateExtractor.extractDates(text);
        assertEquals(List.of("12/05/2023", "15/08/2024", "29/02/2020"), dates);
    }

    @Test
    void testInvalidDates() {
        String text = "The dates 32/01/2023, 15/13/2022, and 29/02/2021 are incorrect.";
        List<String> dates = DateExtractor.extractDates(text);
        assertEquals(List.of("29/02/2021"), dates); // Only valid-looking date(Feb..)
    }

    @Test
    void testNoDates() {
        String text = "No dates here, just text.";
        List<String> dates = DateExtractor.extractDates(text);
        assertTrue(dates.isEmpty());
    }
}
