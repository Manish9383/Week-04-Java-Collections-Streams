package regex.extraction_problems.extract_dates_in_dd_mm_yyyy_format;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class DateExtractor {
    private static final String regex =
            "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})\\b";

    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}
