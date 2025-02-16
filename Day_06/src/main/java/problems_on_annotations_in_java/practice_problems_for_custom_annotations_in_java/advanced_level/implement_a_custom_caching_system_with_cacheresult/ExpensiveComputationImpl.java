package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_caching_system_with_cacheresult;

public class ExpensiveComputationImpl implements ExpensiveComputation {
    @Override
    public int compute(int number) {
        System.out.println("Computing value for: " + number);
        try {
            Thread.sleep(2000); // Simulating expensive computation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * number;
    }
}
