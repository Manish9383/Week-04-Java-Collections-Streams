package regex_test_files.advanced_problems_test_files.extract_currency_values_from_a_text;


import static org.junit.jupiter.api.Assertions.*;

import regex.advanced_problems.extract_currency_values_from_a_text.CurrencyExtractor;
import org.junit.jupiter.api.Test;

import java.util.List;

class CurrencyExtractorTest {

    @Test
    void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> values = CurrencyExtractor.extractCurrencyValues(text);
        assertEquals(List.of("$45.99", "10.50"), values);
    }

    @Test
    void testCurrencyWithoutDecimal() {
        String text = "Total cost is $100 and savings are 20 dollars.";
        List<String> values = CurrencyExtractor.extractCurrencyValues(text);
        assertEquals(List.of("$100", "20"), values);
    }

    @Test
    void testNoCurrencyValues() {
        String text = "There are no prices in this text.";
        List<String> values = CurrencyExtractor.extractCurrencyValues(text);
        assertTrue(values.isEmpty());
    }

    @Test
    void testEdgeCases() {
        String text = "Items: $9, 5.00, and $0.99.";
        List<String> values = CurrencyExtractor.extractCurrencyValues(text);
        assertEquals(List.of("$9", "5.00", "$0.99"), values);
    }
}
