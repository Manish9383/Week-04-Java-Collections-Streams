package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_caching_system_with_cacheresult;


public interface ExpensiveComputation {
    @CacheResult
    int compute(int number);
}
