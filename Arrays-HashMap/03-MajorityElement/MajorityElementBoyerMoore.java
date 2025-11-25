public class MajorityElementBoyerMoore {
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        // Test 1: Simple Majority
        int[] test1 = { 3, 2, 3 };
        System.out.println("Test 1 Output: " + majorityElement(test1)); // Expected: 3

        // Test 2: Majority at the End
        int[] test2 = { 1, 1, 2, 2, 2 };
        System.out.println("Test 2 Output: " + majorityElement(test2)); // Expected: 2

        // Test 3: All Same Elements
        int[] test3 = { 5, 5, 5, 5 };
        System.out.println("Test 3 Output: " + majorityElement(test3)); // Expected: 5

        // Test 4: Single Element
        int[] test4 = { 7 };
        System.out.println("Test 4 Output: " + majorityElement(test4)); // Expected: 7

        // Test 5: Negative Numbers
        int[] test5 = { -1, -1, -1, 2, 3 };
        System.out.println("Test 5 Output: " + majorityElement(test5)); // Expected: -1

        // Test 6: Large Majority Just Over Half
        int[] test6 = { 1, 2, 1, 2, 1 };
        System.out.println("Test 6 Output: " + majorityElement(test6)); // Expected: 1

        // Test 7: Majority Spread Throughout
        int[] test7 = { 2, 1, 2, 3, 2, 4, 2 };
        System.out.println("Test 7 Output: " + majorityElement(test7)); // Expected: 2
    }
}