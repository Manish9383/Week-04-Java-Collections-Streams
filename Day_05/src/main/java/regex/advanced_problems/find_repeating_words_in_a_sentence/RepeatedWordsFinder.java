package regex.advanced_problems.find_repeating_words_in_a_sentence;


import java.util.*;
import java.util.regex.*;

public class RepeatedWordsFinder {
    private static final String regex = "\\b(\\w+)\\b";

    public static Set<String> findRepeatedWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text.toLowerCase());

        while (matcher.find()) {
            String word = matcher.group(1);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        Set<String> repeatedWords = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedWords.add(entry.getKey());
            }
        }
        return repeatedWords;
    }
}
