package junit.performance_testing_using_timeout;


public class PerformanceTester {

    // Simulates a long-running task that sleeps for 3 seconds
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        return "Task Completed";
    }
}
