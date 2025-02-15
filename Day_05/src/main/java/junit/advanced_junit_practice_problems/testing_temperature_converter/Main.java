package junit.advanced_junit_practice_problems.testing_temperature_converter;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println("Converted to Fahrenheit: " + fahrenheit);

        System.out.print("\nEnter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();
        double celsiusConverted = TemperatureConverter.fahrenheitToCelsius(fahrenheitInput);
        System.out.println("Converted to Celsius: " + celsiusConverted);

        scanner.close();
    }
}
