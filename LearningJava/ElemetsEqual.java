package LearningJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ElemetsEqual {
    public static void main(String[] args) {
        Integer[] arr = { 1, 1, 1, 1, 1 };
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        if (set.size() == 1) {
            System.out.println("All elements of array are same");
        } else {
            System.out.println("All elements of array are not same");
        }
    }
}
