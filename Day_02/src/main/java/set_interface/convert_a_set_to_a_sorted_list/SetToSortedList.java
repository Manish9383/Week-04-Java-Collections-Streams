package set_interface.convert_a_set_to_a_sorted_list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class SetToSortedList {

    public List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);
        return list;
    }
}
