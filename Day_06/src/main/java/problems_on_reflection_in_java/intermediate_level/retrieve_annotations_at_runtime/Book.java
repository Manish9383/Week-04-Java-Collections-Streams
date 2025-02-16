package problems_on_reflection_in_java.intermediate_level.retrieve_annotations_at_runtime;


// Apply custom annotation
@Author(name = "Manish Patel")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}
