package list_interface.rotate_elements_in_a_list;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);

        int positions = 2;

        ListRotate rotator = new ListRotate();

        List<Integer> result = rotator.rotateList(inputList, positions);

        System.out.println("Original List :"+inputList);
        System.out.println("After rotating the list :"+result);
    }
}
