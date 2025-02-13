package buffered_streams_efficient_file_copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingFileStream {
    public static void fileMaker(String sourceFile, String destinationFilePath){
        long startTime=0,endTime=0;

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            startTime = System.nanoTime();

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            endTime = System.nanoTime();
            System.out.println("\nFile successfully copied to: " + destinationFilePath);
        } catch (IOException io) {
            System.err.println("Error occurred: " + io.getMessage());
        }

        System.out.println("\nTime taken to copy a file using file stream :"+(endTime-startTime)/1000000+" ms");
    }
}
