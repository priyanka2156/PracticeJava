import java.util.Arrays;

public class SecLargestArr {
    public static void main(String[] args) {
        int arr[] = { 8, 2, 5, 15, 25, 23 };
        int temp, size;
        size = arr.length;
        System.out.println("Array size is " + size);

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array in ascending order ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Second Largest Number is " + arr[size - 2]);
    }
}
