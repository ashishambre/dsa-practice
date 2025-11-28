import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsKPrefixSum {
    public static int countSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);
        int result = 0;
        int prefixSum = 0;
        for (int num : nums) {
            prefixSum += num;
            if (sumCountMap.containsKey(prefixSum - k)) {
                result += sumCountMap.get(prefixSum - k);
            }
            sumCountMap.put(prefixSum, sumCountMap.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countSubarrayWithSumK(new int[] { 1, 1, 1 }, 2));
        // expect 2 ([1,1] at (0,1) and (1,2))
        System.out.println(countSubarrayWithSumK(new int[] { 1, 2, 3 }, 3));
        // expect 2 ([1,2], [3])
        System.out.println(countSubarrayWithSumK(new int[] { 3 }, 3));
        // expect 1
        System.out.println(countSubarrayWithSumK(new int[] { 1, -1, 0 }, 0));
        // expect 3 ([1,-1], [0], [1,-1,0])
        System.out.println(countSubarrayWithSumK(new int[] {}, 0));
        // expect 0
    }
}
