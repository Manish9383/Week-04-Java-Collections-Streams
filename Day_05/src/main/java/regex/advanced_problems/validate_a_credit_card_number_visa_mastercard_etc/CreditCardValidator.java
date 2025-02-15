package regex.advanced_problems.validate_a_credit_card_number_visa_mastercard_etc;


import java.util.regex.Pattern;

public class CreditCardValidator {
    private static final String VISA_REGEX = "^4[0-9]{15}$";// Visa: 16 digits, starts with 4
    private static final String MASTERCARD_REGEX = "^5[1-5][0-9]{14}$"; // MasterCard 16 digits starts with 51-55

    public static boolean isValidVisa(String cardNumber) {
        return Pattern.matches(VISA_REGEX, cardNumber);
    }

    public static boolean isValidMasterCard(String cardNumber) {
        return Pattern.matches(MASTERCARD_REGEX, cardNumber);
    }

    public static String getCardType(String cardNumber) {
        if (isValidVisa(cardNumber)) {
            return "Visa";
        } else if (isValidMasterCard(cardNumber)) {
            return "MasterCard";
        } else {
            return "Invalid";
        }
    }
}
