package set_interface.find_subsets;

import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        SetOperations operations = new SetOperations();

        boolean result = operations.isSubset(set1, set2);

        System.out.println("Set1 :{"+set1+"}");
        System.out.println("Set2 :{"+set2+"}");

        System.out.println("Is set1 is a subset of set2? " + result);
    }
}
