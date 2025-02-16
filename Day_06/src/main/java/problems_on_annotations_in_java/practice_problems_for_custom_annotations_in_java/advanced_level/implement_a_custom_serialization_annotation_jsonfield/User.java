package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_serialization_annotation_jsonfield;


public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    private String password; // This field should not be serialized

    public User(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }
}
