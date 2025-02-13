package list_interface.find_the_nth_element_from_the_end;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;

        LinkedListt helper = new LinkedListt();

        String result = helper.findNthFromEnd(list, N);
        System.out.println(result);
    }
}
