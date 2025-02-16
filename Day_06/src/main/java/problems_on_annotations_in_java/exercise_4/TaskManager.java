package problems_on_annotations_in_java.exercise_4;


public class TaskManager {

    @TaskInfo(priority = Priority.HIGH, assignedTo = "Manish")
    public void deployFeature() {
        System.out.println("Deploying feature...");
    }

    @TaskInfo(priority = Priority.LOW, assignedTo = "Raj")
    public void cleanUpLogs() {
        System.out.println("Cleaning up logs...");
    }
}
