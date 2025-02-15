package regex.extraction_problems.extract_all_email_addresses_from_a_text;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text containing email addresses: ");
        String text = scanner.nextLine();

        List<String> emails = EmailExtractor.extractEmails(text);

        if (!emails.isEmpty()) {
            System.out.println(" Extracted Emails:");
            for (String email : emails) {
                System.out.println(email);
            }
        } else {
            System.out.println(" No valid email addresses found.");
        }

        scanner.close();
    }
}
