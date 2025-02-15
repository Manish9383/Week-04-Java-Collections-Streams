package junit.advanced_junit_practice_problems.testing_date_formatter;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Converts yyyy-MM-dd to dd-MM-yyyy
    public static String formatDate(String inputDate) {
        try {
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate date = LocalDate.parse(inputDate, inputFormatter);
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd.");
        }
    }
}
