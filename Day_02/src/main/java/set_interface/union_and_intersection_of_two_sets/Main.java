package set_interface.union_and_intersection_of_two_sets;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);


        Set<Integer> unionSet = SetOperations.union(set1, set2);

        System.out.println("Set1 :{"+set1+"}");
        System.out.println("Set2 :{"+set2+"}");
        System.out.println("Union: " + unionSet);


        Set<Integer> intersectionSet = SetOperations.intersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}