package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_a_maxlength_annotation_for_field_validation;


import java.lang.reflect.Field;

public class User {

    @MaxLength(10) // Restrict username length to 10 characters
    private String username;

    public User(String username) {
        validateFields(username);
        this.username = username;
    }

    private void validateFields(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength annotation = field.getAnnotation(MaxLength.class);
                if (username.length() > annotation.value()) {
                    throw new IllegalArgumentException("Username exceeds maximum length of " + annotation.value());
                }
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Field not found", e);
        }
    }

    public String getUsername() {
        return username;
    }
}
