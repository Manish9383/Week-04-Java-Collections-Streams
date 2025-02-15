package regex.advanced_problems.extract_programming_language_names_from_a_text;


import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageExtractor {
    private static final String[] PROGRAMMING_LANGUAGES = {
            "JavaScript", "Java", "Python", "C\\+\\+", "C#", "Ruby", "Swift", "Go",
            "Kotlin", "PHP", "TypeScript", "Perl", "Rust", "Dart", "Scala", "Haskell"
    };

    // Improved regex pattern
    private static final String LANGUAGE_REGEX = "(?<!\\w)(" + String.join("|", PROGRAMMING_LANGUAGES) + ")(?!\\w)";

    public static List<String> extractProgrammingLanguages(String text) {
        List<String> languages = new ArrayList<>();
        Pattern pattern = Pattern.compile(LANGUAGE_REGEX, Pattern.CASE_INSENSITIVE); // Case insensitive
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
}
