package regex.extraction_problems.extract_links_from_a_web_page;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text containing URLs: ");
        String text = scanner.nextLine();

        List<String> links = LinkExtractor.extractLinks(text);

        if (!links.isEmpty()) {
            System.out.println(" Extracted Links:");
            System.out.println(String.join(", ", links));
        } else {
            System.out.println(" No valid links found.");
        }

        scanner.close();
    }
}
