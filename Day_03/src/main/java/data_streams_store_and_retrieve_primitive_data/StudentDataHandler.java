package data_streams_store_and_retrieve_primitive_data;

import java.io.*;

public class StudentDataHandler {
    public static void storeStudentData(String filePath, Student student) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());
            System.out.println("Student data successfully written to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing student data: " + e.getMessage());
        }
    }

    public static Student retrieveStudentData(String filePath) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            return new Student(rollNumber, name, gpa);
        } catch (IOException e) {
            System.err.println("Error reading student data: " + e.getMessage());
            return null;
        }
    }
}
