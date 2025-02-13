package buffered_streams_efficient_file_copy;

import java.io.*;

public class FileCopyUsingBufferedStreams {
    public static void fileMaker(String sourceFilePath, String destFilePath) {
        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath);
        long startTime=0,endTime=0;

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourceFilePath);
            return;
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            long totalBytesCopied = 0;
            long fileSize = sourceFile.length();

          startTime=System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;

                if (totalBytesCopied % (1024 * 1024) < 4096) {
                    int progress = (int) ((totalBytesCopied * 100) / fileSize);
                }
            }
          endTime=System.nanoTime();

            System.out.println("\nFile copied successfully to: " + destFilePath);

        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
        System.out.println("\nTime taken to copy a file using buffered stream :"+(endTime-startTime)/1000000+" ms");
    }
}