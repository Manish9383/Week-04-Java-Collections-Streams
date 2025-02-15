package junit.testing_exception_handling;


public class MathOperations {

    // Method to perform division, throws exception if b == 0
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}
