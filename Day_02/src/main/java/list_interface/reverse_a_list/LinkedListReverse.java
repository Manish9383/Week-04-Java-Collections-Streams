package list_interface.reverse_a_list;

import java.util.*;

import java.util.*;

public class LinkedListReverse {
    public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
}
