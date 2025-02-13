package set_interface.convert_a_set_to_a_sorted_list;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        SetToSortedList converter = new SetToSortedList();

        List<Integer> sortedList = converter.convertToSortedList(set);
        System.out.println("Original Set was : {"+set+"}");
        System.out.println("Sorted List is: " + sortedList);
    }
}
