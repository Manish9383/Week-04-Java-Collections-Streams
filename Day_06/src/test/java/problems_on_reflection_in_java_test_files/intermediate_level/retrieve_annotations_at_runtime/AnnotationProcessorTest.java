package problems_on_reflection_in_java_test_files.intermediate_level.retrieve_annotations_at_runtime;


import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.intermediate_level.retrieve_annotations_at_runtime.AnnotationProcessor;
import problems_on_reflection_in_java.intermediate_level.retrieve_annotations_at_runtime.Book;

class AnnotationProcessorTest {

    @Test
    void testProcessAnnotations() {
        AnnotationProcessor.processAnnotations(Book.class);
    }
}
