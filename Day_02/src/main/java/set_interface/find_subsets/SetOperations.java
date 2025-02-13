package set_interface.find_subsets;

import java.util.Set;

public class SetOperations {

    public boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
}
