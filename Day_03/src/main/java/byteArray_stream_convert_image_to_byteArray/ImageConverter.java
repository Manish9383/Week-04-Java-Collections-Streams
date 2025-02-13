package byteArray_stream_convert_image_to_byteArray;

import java.io.*;

public class ImageConverter {
    public static byte[] imageToByteArray(String imagePath) {
        File file = new File(imagePath);
        if (!file.exists()) {
            System.out.println("Image file not found: " + imagePath);
            return null;
        }

        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            return bos.toByteArray();

        } catch (IOException e) {
            System.err.println("Error converting image to byte array: " + e.getMessage());
            return null;
        }
    }

    public static void byteArrayToImage(byte[] imageBytes, String outputPath) {
        if (imageBytes == null) {
            System.out.println("No data to write to image file.");
            return;
        }

        try (ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image successfully saved to: " + outputPath);

        } catch (IOException e) {
            System.err.println("Error writing byte array to image file: " + e.getMessage());
        }
    }

}
