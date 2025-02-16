package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_an_annotation_to_mark_important_methods;


public class ServiceClass {

    @ImportantMethod(level = "HIGH")
    public void processData() {
        System.out.println("Processing data...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void helperMethod() {
        System.out.println("This method is not marked as important.");
    }
}
