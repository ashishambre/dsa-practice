import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public static Object[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2)
                    intersection.add(num1);
            }
        }
        return intersection.toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2 };
        int[] nums2 = { 1, 2, 2 };
        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }
}
