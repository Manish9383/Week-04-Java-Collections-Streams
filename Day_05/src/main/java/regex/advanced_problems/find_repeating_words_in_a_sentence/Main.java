package regex.advanced_problems.find_repeating_words_in_a_sentence;


import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        Set<String> repeatedWords = RepeatedWordsFinder.findRepeatedWords(text);

        if (!repeatedWords.isEmpty()) {
            System.out.println(" Repeated Words:");
            System.out.println(String.join(", ", repeatedWords));
        } else {
            System.out.println(" No repeated words found.");
        }

        scanner.close();
    }
}
