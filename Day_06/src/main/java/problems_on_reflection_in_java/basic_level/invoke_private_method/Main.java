package problems_on_reflection_in_java.basic_level.invoke_private_method;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Invoke private multiply method using Reflection
        int result = PrivateMethodInvoker.invokeMultiply(calculator, 6, 7);

        System.out.println("Multiplication Result: " + result);
    }
}
