package file_handling_read_and_write_a_text_file;

import java.io.*;

public class FileHandling {
    public static void fileMaker(String sourceFilePath, String destinationFilePath){
        File sourceFile = new File(sourceFilePath);

        if (!sourceFile.exists()) {
            System.out.println("File not found! Please provide the correct path.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File successfully copied to: " + destinationFilePath);
        } catch (IOException io) {
            System.err.println("Error occurred: " + io.getMessage());
        }
    }
}
