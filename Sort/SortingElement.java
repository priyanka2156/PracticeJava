package Sort;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement {
    public static void main(String[] args) {
        Integer arr[] = { 20, 40, 30, 70, 10 };
        System.out.println("Arrays before sorting" + Arrays.toString(arr));
        // Arrays.parallelSort(arr);
        // Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Arrays after sorting" + Arrays.toString(arr));
    }
}
