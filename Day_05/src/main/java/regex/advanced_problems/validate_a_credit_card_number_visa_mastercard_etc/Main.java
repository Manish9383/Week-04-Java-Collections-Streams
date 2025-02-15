package regex.advanced_problems.validate_a_credit_card_number_visa_mastercard_etc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String cardNumber = scanner.nextLine();

        String cardType = CreditCardValidator.getCardType(cardNumber);

        if (!cardType.equals("Invalid")) {
            System.out.println(" Valid " + cardType + " credit card.");
        } else {
            System.out.println(" Invalid credit card number.");
        }

        scanner.close();
    }
}
