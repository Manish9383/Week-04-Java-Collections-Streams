package list_interface.rotate_elements_in_a_list;

import java.util.List;
import java.util.ArrayList;

public class ListRotate {

    public List<Integer> rotateList(List<Integer> inputList, int positions) {
        if (positions == 0 || inputList.size() <= 1) {
            return inputList;
        }

        int size = inputList.size();

        positions = (positions % size + size) % size;

        List<Integer> rotatedList = new ArrayList<>();

        for (int i = positions; i < size; i++) {
            rotatedList.add(inputList.get(i));
        }

        for (int i = 0; i < positions; i++) {
            rotatedList.add(inputList.get(i));
        }

        return rotatedList;
    }
}
