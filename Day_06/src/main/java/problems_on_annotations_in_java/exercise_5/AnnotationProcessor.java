package problems_on_annotations_in_java.exercise_5;


import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void processBugReports(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);
                System.out.println("Method: " + method.getName());
                for (BugReport bug : bugReports.value()) {
                    System.out.println("Bug Description: " + bug.description());
                    System.out.println("Reported By: " + bug.reportedBy());
                    System.out.println("-----------------------------");
                }
            }
        }
    }
}
