import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHM {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int current = 0; current < nums.length; current++) {
            int num = nums[current];

            // 1. Compute what you NEED based on pattern
            int complement = target - num;

            // 2. Check if we've seen "need" before
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), current };
            }

            // 3. Otherwise, remember the current
            map.put(num, current);
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        // ✅ 1. Empty Array
        int[] nums0 = {};
        int target0 = 10;
        System.out.println("Test 0 (Empty): " + Arrays.toString(twoSum(nums0, target0)));

        // ✅ 2. Single Element
        int[] nums1 = { 5 };
        int target1 = 5;
        System.out.println("Test 1 (Single Element): " + Arrays.toString(twoSum(nums1, target1)));

        // ✅ 3. No Valid Pair
        int[] nums2 = { 1, 2, 3, 4 };
        int target2 = 100;
        System.out.println("Test 2 (No Pair): " + Arrays.toString(twoSum(nums2, target2)));

        // ✅ 4. Negative Numbers
        int[] nums3 = { -3, 4, 1, 2 };
        int target3 = -1;
        System.out.println("Test 3 (Negative): " + Arrays.toString(twoSum(nums3, target3)));

        // ✅ 5. Zero Involved
        int[] nums4 = { 0, 4, 3, 0 };
        int target4 = 0;
        System.out.println("Test 4 (Zeroes): " + Arrays.toString(twoSum(nums4, target4)));

        // ✅ 6. Duplicates but Only One Valid Pair
        int[] nums5 = { 2, 2, 5, 9 };
        int target5 = 11;
        System.out.println("Test 5 (Duplicates): " + Arrays.toString(twoSum(nums5, target5)));

        // ✅ 7. Valid Pair Not at Start
        int[] nums6 = { 5, 1, 5 };
        int target6 = 6;
        System.out.println("Test 6 (Late Pair): " + Arrays.toString(twoSum(nums6, target6)));

        // ✅ 8. Large Numbers
        int[] nums7 = { 1_000_000_000, 7, -1_000_000_000 };
        int target7 = 7;
        System.out.println("Test 7 (Large Numbers): " + Arrays.toString(twoSum(nums7, target7)));

        // ✅ 9. Pair at the End
        int[] nums8 = { 9, 8, 7, 1, 2, 3 };
        int target8 = 5;
        System.out.println("Test 8 (End Pair): " + Arrays.toString(twoSum(nums8, target8)));

        // ✅ 10. Multiple Valid Pairs (brute force should pick the first)
        int[] nums9 = { 1, 2, 3, 4 };
        int target9 = 5;
        System.out.println("Test 9 (Multiple Pairs): " + Arrays.toString(twoSum(nums9, target9)));
    }
}
