package problems_on_annotations_in_java.exercise_5;


public class IssueTracker {

    @BugReport(description = "Null pointer exception on line 42", reportedBy = "Manish")
    @BugReport(description = "Memory leak observed under high load", reportedBy = "Raj")
    public void processIssues() {
        System.out.println("Processing reported issues...");
    }
}
