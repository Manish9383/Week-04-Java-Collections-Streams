package regex_test_files.advanced_problems_test_files.find_repeating_words_in_a_sentence;

import static org.junit.jupiter.api.Assertions.*;

import regex.advanced_problems.find_repeating_words_in_a_sentence.RepeatedWordsFinder;
import org.junit.jupiter.api.Test;

import java.util.Set;

class RepeatedWordsFinderTest {

    @Test
    void testFindRepeatedWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> words = RepeatedWordsFinder.findRepeatedWords(text);
        assertEquals(Set.of("is", "repeated"), words);
    }

    @Test
    void testCaseInsensitive() {
        String text = "Hello hello world. World is amazing!";
        Set<String> words = RepeatedWordsFinder.findRepeatedWords(text);
        assertEquals(Set.of("hello", "world"), words);
    }

    @Test
    void testNoRepeatedWords() {
        String text = "Every word is unique.";
        Set<String> words = RepeatedWordsFinder.findRepeatedWords(text);
        assertTrue(words.isEmpty());
    }

    @Test
    void testPunctuationHandling() {
        String text = "Wow! Wow, that was fun. Fun is good!";
        Set<String> words = RepeatedWordsFinder.findRepeatedWords(text);
        assertEquals(Set.of("wow", "fun"), words);
    }
}
