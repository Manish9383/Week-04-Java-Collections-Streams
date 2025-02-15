package regex.advanced_problems.validate_a_social_security_number_ssn;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence containing an SSN: ");
        String text = scanner.nextLine();

        String ssn = SSNValidator.extractSSN(text);

        if (ssn != null) {
            System.out.println(" \"" + ssn + "\" is a valid SSN.");
        } else {
            System.out.println(" No valid SSN found.");
        }

        scanner.close();
    }
}
