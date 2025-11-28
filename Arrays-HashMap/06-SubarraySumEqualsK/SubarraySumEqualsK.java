public class SubarraySumEqualsK {
    public static int findSubarraysWithSumK(int[] arr, int k) {
        int subarrayWithSumK = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k)
                    subarrayWithSumK++;
            }
        }
        return subarrayWithSumK;
    }

    public static void main(String[] args) {
        System.out.println(findSubarraysWithSumK(new int[] { 1, 1, 1 }, 2));
        // expect 2 ([1,1] at (0,1) and (1,2))
        System.out.println(findSubarraysWithSumK(new int[] { 1, 2, 3 }, 3));
        // expect 2 ([1,2], [3])
        System.out.println(findSubarraysWithSumK(new int[] { 3 }, 3));
        // expect 1
        System.out.println(findSubarraysWithSumK(new int[] { 1, -1, 0 }, 0));
        // expect 3 ([1,-1], [0], [1,-1,0])
        System.out.println(findSubarraysWithSumK(new int[] {}, 0));
        // expect 0
    }
}
