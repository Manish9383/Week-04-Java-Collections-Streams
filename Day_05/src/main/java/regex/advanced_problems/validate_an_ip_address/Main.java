package regex.advanced_problems.validate_an_ip_address;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IPv4 address: ");
        String ip = scanner.nextLine();

        if (IPAddressValidator.isValidIPAddress(ip)) {
            System.out.println(" Valid IPv4 address");
        } else {
            System.out.println(" Invalid IPv4 address");
        }

        scanner.close();
    }
}
