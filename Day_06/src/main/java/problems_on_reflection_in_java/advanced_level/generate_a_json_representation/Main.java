package problems_on_reflection_in_java.advanced_level.generate_a_json_representation;



public class Main {
    public static void main(String[] args) {
        JsonPerson person = new JsonPerson("Manish", 23, "Banglore");

        // Convert object to JSON string
        String json = JsonSerializer.toJson(person);

        // Display JSON output
        System.out.println("JSON Representation: " + json);
    }
}
