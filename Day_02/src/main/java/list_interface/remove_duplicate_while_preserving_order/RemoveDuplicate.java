package list_interface.remove_duplicate_while_preserving_order;

import java.util.ArrayList;
import java.util.List;
 public class RemoveDuplicate {
    public List<Integer> removeDupli(List<Integer> list)
    {
        List<Integer> result = new ArrayList<>();

        for (Integer element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

}
