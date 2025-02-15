package junit.advanced_junit_practice_problems.testing_date_formatter;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date in yyyy-MM-dd format: ");
        String inputDate = scanner.nextLine();

        try {
            String formattedDate = DateFormatter.formatDate(inputDate);
            System.out.println("Formatted Date: " + formattedDate);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
