package regex.extraction_problems.extract_all_email_addresses_from_a_text;


import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class EmailExtractor {
    private static final String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}
