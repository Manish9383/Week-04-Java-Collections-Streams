package regex.replace_and_modify_strings.censor_bad_words_in_a_sentence;


import java.util.List;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static String censorText(String text, List<String> badWords) {
        for (String word : badWords) {
            String regex = "\\b" + Pattern.quote(word) + "\\b";
            text = text.replaceAll(regex, "****");
        }
        return text;
    }
}
