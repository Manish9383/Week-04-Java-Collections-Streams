package junit.performance_testing_using_timeout;


public class Main {
    public static void main(String[] args) {
        System.out.println("Starting long-running task...");
        String result = PerformanceTester.longRunningTask();
        System.out.println("Result: " + result);
    }
}
