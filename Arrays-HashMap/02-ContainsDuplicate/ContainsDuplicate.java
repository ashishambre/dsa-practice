import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int nums[]) {
        if (nums == null || nums.length < 2)
            return false;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] test0 = {};
        int[] test1 = { 5 };
        int[] test2 = { 1, 2, 3, 4, 1 };
        int[] test3 = { 1, 2, 3, 4 };
        int[] test4 = { 2, 2, 2, 2 };
        int[] test5 = { -1, 3, 0, -1 };
        int[] test6 = { 1000000000, -1000000000, 5, 1000000000 };

        System.out.println(containsDuplicate(test0)); // false
        System.out.println(containsDuplicate(test1)); // false
        System.out.println(containsDuplicate(test2)); // true
        System.out.println(containsDuplicate(test3)); // false
        System.out.println(containsDuplicate(test4)); // true
        System.out.println(containsDuplicate(test5)); // true
        System.out.println(containsDuplicate(test6)); // true
    }
}
