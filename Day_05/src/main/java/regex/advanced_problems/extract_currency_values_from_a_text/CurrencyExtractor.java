package regex.advanced_problems.extract_currency_values_from_a_text;


import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyExtractor {
    private static final String regex = "\\$?\\d+(\\.\\d{2})?";

    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }
        return currencyValues;
    }
}
