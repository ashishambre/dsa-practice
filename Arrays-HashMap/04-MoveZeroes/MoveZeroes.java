import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swapping 0 with non zero number
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = { 0, 0, 1, 2, 0, 4, 5 };
        int[] arr2 = { 0, 0, 0 };
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 0, 1, 0, 3, 12 };
        int[] arr5 = { 1, 0 };
        int[] arr6 = { 0, 1 };

        System.out.println(Arrays.toString(moveZeroes(arr1)));
        System.out.println(Arrays.toString(moveZeroes(arr2)));
        System.out.println(Arrays.toString(moveZeroes(arr3)));
        System.out.println(Arrays.toString(moveZeroes(arr4)));
        System.out.println(Arrays.toString(moveZeroes(arr5)));
        System.out.println(Arrays.toString(moveZeroes(arr6)));
    }
}
