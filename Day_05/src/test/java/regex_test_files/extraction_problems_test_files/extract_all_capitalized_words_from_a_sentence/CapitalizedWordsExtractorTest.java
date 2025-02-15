package regex_test_files.extraction_problems_test_files.extract_all_capitalized_words_from_a_sentence;


import static org.junit.jupiter.api.Assertions.*;

import regex.extraction_problems.extract_all_capitalized_words_from_a_sentence.CapitalizedWordsExtractor;
import org.junit.jupiter.api.Test;

import java.util.List;

class CapitalizedWordsExtractorTest {

    @Test
    void testValidCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(text);
        assertEquals(List.of("Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"), words);
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this is a lowercase sentence.";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(text);
        assertTrue(words.isEmpty());
    }

    @Test
    void testSingleCapitalizedWord() {
        String text = "Hello world";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(text);
        assertEquals(List.of("Hello"), words);
    }

    @Test
    void testWordsWithNumbersAndSpecialChars() {
        String text = "John123 and Apple! are words.";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(text);
        assertEquals(List.of("John123", "Apple"), words);
    }
}
