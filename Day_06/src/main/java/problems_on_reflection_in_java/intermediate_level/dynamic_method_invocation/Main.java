package problems_on_reflection_in_java.intermediate_level.dynamic_method_invocation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Invoke method dynamically using Reflection
        int result = DynamicMethodInvoker.invokeMethod(methodName, a, b);

        if (result != -1) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid method name.");
        }

        scanner.close();
    }
}
