package byteArray_stream_convert_image_to_byteArray;


import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class ImageConverterTest {

    private static final String SOURCE_IMAGE = "src/main/resources/Ryuk.png";
    private static final String OUTPUT_IMAGE = "src/main/resources/RyukCopy.png";

    @Test
    void testImageConversion() {
        byte[] imageBytes = ImageConverter.imageToByteArray(SOURCE_IMAGE);
        assertNotNull(imageBytes, "Byte array should not be null.");

        ImageConverter.byteArrayToImage(imageBytes, OUTPUT_IMAGE);
        assertTrue(new File(OUTPUT_IMAGE).exists(), "Output image file should be created.");
    }
}

