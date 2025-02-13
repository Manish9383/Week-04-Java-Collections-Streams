package serialization_save_and_retrieve_an_object;

import java.io.*;
import java.util.List;

public class EmployeeManager {
    public static void saveEmployees(List<Employee> employees, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
            System.out.println("\nEmployees saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving employees: " + e.getMessage());
        }
    }


    public static List<Employee> loadEmployees(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading employees: " + e.getMessage());
            return null;
        }
    }
}

