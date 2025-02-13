package list_interface.reverse_a_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayListReverse arrayListReverser = new ArrayListReverse();
        LinkedListReverse linkedListReverser = new LinkedListReverse();

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Orginal list was :"+arrayList);
        System.out.println("Reversed ArrayList: " + arrayListReverser.reverseArrayList(arrayList));
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        System.out.println("Reversed LinkedList: " + linkedListReverser.reverseLinkedList(linkedList));
    }
}
