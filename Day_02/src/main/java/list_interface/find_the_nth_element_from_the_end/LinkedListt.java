package list_interface.find_the_nth_element_from_the_end;

import java.util.LinkedList;

public class LinkedListt{
        public String findNthFromEnd(LinkedList<String> list, int N) {
            int size = list.size();

            if (N > size) {
                return "N is greater than the size of the list";
            }

            int indexFromStart = size - N;

            return list.get(indexFromStart);
        }
    }
