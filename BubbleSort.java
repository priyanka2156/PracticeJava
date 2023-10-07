public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 40, 35, 2 };
        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Array after Bubble sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
