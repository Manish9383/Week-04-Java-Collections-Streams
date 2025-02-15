package regex_test_files.advanced_problems_test_files.extract_programming_language_names_from_a_text;


import static org.junit.jupiter.api.Assertions.*;

import regex.advanced_problems.extract_programming_language_names_from_a_text.ProgrammingLanguageExtractor;
import org.junit.jupiter.api.Test;

import java.util.List;

class ProgrammingLanguageExtractorTest {

    @Test
    void testExtractProgrammingLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = ProgrammingLanguageExtractor.extractProgrammingLanguages(text);
        assertEquals(List.of("Java", "Python", "JavaScript", "Go"), languages);
    }

    @Test
    void testNoProgrammingLanguages() {
        String text = "This is just a random text without any programming languages.";
        List<String> languages = ProgrammingLanguageExtractor.extractProgrammingLanguages(text);
        assertTrue(languages.isEmpty());
    }

    @Test
    void testMixedCaseProgrammingLanguages() {
        String text = "I have experience with java, PYTHON, and RuSt.";
        List<String> languages = ProgrammingLanguageExtractor.extractProgrammingLanguages(text);
        assertEquals(List.of("java", "PYTHON", "RuSt"), languages);
    }

    @Test
    void testEdgeCases() {
        String text = "I enjoy coding in C++, C#, and TypeScript!";
        List<String> languages = ProgrammingLanguageExtractor.extractProgrammingLanguages(text);
        assertEquals(List.of("C++", "C#", "TypeScript"), languages);
    }
}
