package list_interface.reverse_a_list;

import java.util.*;

public class ArrayListReverse {
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

}
