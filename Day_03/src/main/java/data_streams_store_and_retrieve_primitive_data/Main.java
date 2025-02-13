package data_streams_store_and_retrieve_primitive_data;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/student_data.bin";

        Student student1 = new Student(28, "Manish Patel", 7.8);

        StudentDataHandler.storeStudentData(filePath, student1);

        Student retrievedStudent = StudentDataHandler.retrieveStudentData(filePath);
        if (retrievedStudent != null) {
            System.out.println("Retrieved Student Details:");
            System.out.println(retrievedStudent);
        }
    }
}
