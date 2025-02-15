package regex.basic_regex_problems.validate_a_licence_plate_number;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a license plate number: ");
        String plate = scanner.nextLine();

        if (LicensePlateValidator.isValidLicensePlate(plate)) {
            System.out.println(" Valid license plate");
        } else {
            System.out.println(" Invalid license plate");
        }

        scanner.close();
    }
}
