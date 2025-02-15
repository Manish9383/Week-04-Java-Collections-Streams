package regex.advanced_problems.extract_programming_language_names_from_a_text;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence containing programming languages: ");
        String text = scanner.nextLine();

        List<String> extractedLanguages = ProgrammingLanguageExtractor.extractProgrammingLanguages(text);

        if (!extractedLanguages.isEmpty()) {
            System.out.println(" Extracted Programming Languages:");
            System.out.println(String.join(", ", extractedLanguages));
        } else {
            System.out.println(" No programming languages found.");
        }

        scanner.close();
    }
}
