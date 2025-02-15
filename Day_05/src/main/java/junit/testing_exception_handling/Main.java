package junit.testing_exception_handling;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int num2 = scanner.nextInt();

        try {
            double result = MathOperations.divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
