package regex.extraction_problems.extract_links_from_a_web_page;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class LinkExtractor {
    private static final String regex =
            "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(?:/\\S*)?\\b";

    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}
