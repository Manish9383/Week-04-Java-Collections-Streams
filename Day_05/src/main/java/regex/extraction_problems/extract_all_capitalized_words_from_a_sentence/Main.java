package regex.extraction_problems.extract_all_capitalized_words_from_a_sentence;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        List<String> capitalizedWords = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        if (!capitalizedWords.isEmpty()) {
            System.out.println(" Extracted Capitalized Words:");
            System.out.println(String.join(", ", capitalizedWords));
        } else {
            System.out.println(" No capitalized words found.");
        }

        scanner.close();
    }
}
