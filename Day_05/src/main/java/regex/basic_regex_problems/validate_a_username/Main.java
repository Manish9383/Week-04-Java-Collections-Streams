package regex.basic_regex_problems.validate_a_username;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (UsernameValidator.isValidUsername(username)) {
            System.out.println(" Valid username");
        } else {
            System.out.println(" Invalid username");
        }

        scanner.close();
    }
}
