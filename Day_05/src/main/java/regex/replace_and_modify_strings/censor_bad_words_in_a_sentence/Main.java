package regex.replace_and_modify_strings.censor_bad_words_in_a_sentence;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> badWords = Arrays.asList("damn", "stupid");

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String censoredText = CensorBadWords.censorText(text, badWords);

        System.out.println(" Censored Text:");
        System.out.println(censoredText);

        scanner.close();
    }
}
