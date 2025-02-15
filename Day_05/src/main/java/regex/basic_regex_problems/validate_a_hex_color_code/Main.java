package regex.basic_regex_problems.validate_a_hex_color_code;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex color code: ");
        String color = scanner.nextLine();

        if (HexColorValidator.isValidHexColor(color)) {
            System.out.println(" Valid hex color code");
        } else {
            System.out.println("Invalid hex color code");
        }

        scanner.close();
    }
}
