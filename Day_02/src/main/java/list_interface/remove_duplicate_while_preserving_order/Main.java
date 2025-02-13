package list_interface.remove_duplicate_while_preserving_order;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);

        RemoveDuplicate rm= new RemoveDuplicate();
        List<Integer> result = rm.removeDupli(inputList);

        System.out.println(result);
    }
}
