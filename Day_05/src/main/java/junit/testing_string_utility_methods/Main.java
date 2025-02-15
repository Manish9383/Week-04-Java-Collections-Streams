package junit.testing_string_utility_methods;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed: " + StringUtils.reverse(input));
        System.out.println("Is Palindrome: " + StringUtils.isPalindrome(input));
        System.out.println("Uppercase: " + StringUtils.toUpperCase(input));

        scanner.close();
    }
}
