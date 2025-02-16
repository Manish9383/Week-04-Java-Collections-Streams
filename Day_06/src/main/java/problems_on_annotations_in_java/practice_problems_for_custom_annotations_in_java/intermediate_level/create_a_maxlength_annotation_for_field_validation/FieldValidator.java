package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_a_maxlength_annotation_for_field_validation;


import java.lang.reflect.Field;

public class FieldValidator {

    public static void validateObject(Object obj) {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    MaxLength annotation = field.getAnnotation(MaxLength.class);
                    if (value.length() > annotation.value()) {
                        throw new IllegalArgumentException(
                                "Validation failed: " + field.getName() + " exceeds max length of " + annotation.value()
                        );
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Error accessing field: " + field.getName(), e);
                }
            }
        }
    }
}
