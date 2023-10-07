
public class Main1 {
    public static void main(String[] args) {

    }

    public int removeDuplicate(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            nums[i++] = nums[j];

            while (j != nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
        }
        return i;
    }

}