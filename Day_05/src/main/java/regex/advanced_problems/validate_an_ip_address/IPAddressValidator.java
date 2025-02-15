package regex.advanced_problems.validate_an_ip_address;


import java.util.regex.Pattern;

public class IPAddressValidator {
    private static final String regex =
            "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}" +
                    "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

    public static boolean isValidIPAddress(String ip) {
        if (!Pattern.matches(regex, ip)) return false;

        // Extra validation to reject leading zeros like "192.168.1.01"
        String[] parts = ip.split("\\.");
        for (String part : parts) {
            if (part.length() > 1 && part.startsWith("0")) {
                return false;
            }
        }
        return true;
    }
}
