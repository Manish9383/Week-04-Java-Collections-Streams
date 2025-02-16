package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.beginner_level.create_a_todo_annotation_for_pending_tasks;


public class Main {
    public static void main(String[] args) {
        // Use Reflection to retrieve and process annotations
        AnnotationProcessor.processTodos(ProjectTasks.class);
    }
}
