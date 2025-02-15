package regex.extraction_problems.extract_all_capitalized_words_from_a_sentence;


import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CapitalizedWordsExtractor {
    private static final String regex = "\\b(?!The\\b)[A-Z][a-zA-Z0-9]*\\b";

    public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
}
