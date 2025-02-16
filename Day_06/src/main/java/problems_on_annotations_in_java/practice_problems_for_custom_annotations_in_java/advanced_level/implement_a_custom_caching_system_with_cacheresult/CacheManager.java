package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_caching_system_with_cacheresult;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeWithCache(Object obj, String methodName, Object... args) {
        try {
            Method method = obj.getClass().getMethod(methodName, int.class);
            if (method.isAnnotationPresent(CacheResult.class)) {
                String key = methodName + "_" + args[0]; // Unique cache key
                if (cache.containsKey(key)) {
                    System.out.println("Returning cached result for: " + args[0]);
                    return cache.get(key);
                }

                Object result = method.invoke(obj, args);
                cache.put(key, result);
                return result;
            }

            return method.invoke(obj, args);
        } catch (Exception e) {
            throw new RuntimeException("Error invoking method: " + methodName, e);
        }
    }
}
