package regex.extraction_problems.extract_dates_in_dd_mm_yyyy_format;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text containing dates: ");
        String text = scanner.nextLine();

        List<String> dates = DateExtractor.extractDates(text);

        if (!dates.isEmpty()) {
            System.out.println(" Extracted Dates:");
            System.out.println(String.join(", ", dates));
        } else {
            System.out.println(" No valid dates found.");
        }

        scanner.close();
    }
}
