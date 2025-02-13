package set_interface.check_if_two_sets_are_equal;

import java.util.Set;

public class SetUtility {

    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null || set2 == null) {
            return false;
        }
        return set1.equals(set2);
    }
}
