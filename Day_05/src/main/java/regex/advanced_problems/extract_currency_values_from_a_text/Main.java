package regex.advanced_problems.extract_currency_values_from_a_text;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence with currency values: ");
        String text = scanner.nextLine();

        List<String> extractedValues = CurrencyExtractor.extractCurrencyValues(text);

        if (!extractedValues.isEmpty()) {
            System.out.println(" Extracted Currency Values:");
            System.out.println(String.join(", ", extractedValues));
        } else {
            System.out.println(" No currency values found.");
        }

        scanner.close();
    }
}
