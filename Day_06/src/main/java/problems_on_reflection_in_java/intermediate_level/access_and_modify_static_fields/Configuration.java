package problems_on_reflection_in_java.intermediate_level.access_and_modify_static_fields;


public class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    public static String getApiKey() {
        return API_KEY;
    }
}
