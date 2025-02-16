package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_caching_system_with_cacheresult;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveComputation original = new ExpensiveComputationImpl();
        ExpensiveComputation proxyInstance = (ExpensiveComputation) Proxy.newProxyInstance(
                original.getClass().getClassLoader(),
                new Class[]{ExpensiveComputation.class},
                new CacheInterceptor(original)
        );

        System.out.println(proxyInstance.compute(5)); // First call, computes
        System.out.println(proxyInstance.compute(5)); // Second call, cached result
        System.out.println(proxyInstance.compute(10)); // First call for 10, computes
        System.out.println(proxyInstance.compute(10)); // Second call for 10, cached result
    }
}
