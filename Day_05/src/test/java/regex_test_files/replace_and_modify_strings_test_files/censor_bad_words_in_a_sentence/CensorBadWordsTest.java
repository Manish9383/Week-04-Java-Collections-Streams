package regex_test_files.replace_and_modify_strings_test_files.censor_bad_words_in_a_sentence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regex.replace_and_modify_strings.censor_bad_words_in_a_sentence.CensorBadWords;

import java.util.Arrays;
import java.util.List;

class CensorBadWordsTest {

    private final List<String> badWords = Arrays.asList("damn", "stupid");

    @Test
    void testCensorText() {
        assertEquals("This is a **** bad example with some **** words.",
                CensorBadWords.censorText("This is a damn bad example with some stupid words.", badWords));

        assertEquals("Hello there!", CensorBadWords.censorText("Hello there!", badWords));
        assertEquals("****, this is bad!", CensorBadWords.censorText("damn, this is bad!", badWords));
        assertEquals("This is a **** idea!", CensorBadWords.censorText("This is a stupid idea!", badWords));
    }

    @Test
    void testWordsInsideOtherWords() {
        assertEquals("This is damnation!", CensorBadWords.censorText("This is damnation!", badWords));
    }
}
