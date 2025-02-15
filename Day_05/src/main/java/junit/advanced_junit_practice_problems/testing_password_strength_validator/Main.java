package junit.advanced_junit_practice_problems.testing_password_strength_validator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password to validate: ");
        String password = scanner.nextLine();

        if (PasswordValidator.isValidPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak. It must be at least 8 characters long, contain one uppercase letter, and one digit.");
        }

        scanner.close();
    }
}
