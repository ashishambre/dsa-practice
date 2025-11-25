import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArraysOptimised {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        for (int num1 : nums1)
            firstSet.add(num1);

        Set<Integer> result = new HashSet<>();
        for (int num2 : nums2) {
            if (firstSet.contains(num2)) {
                result.add(num2);
            }
        }

        int[] output = new int[result.size()];
        int i = 0;
        for (int num : result) {
            output[i++] = num;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIntersection(
                new int[] { 1, 2, 3 },
                new int[] { 2, 3, 4 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] { 1, 2, 3 },
                new int[] { 4, 5, 6 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] {},
                new int[] { 1, 2, 3 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] {},
                new int[] {})));

        System.out.println(Arrays.toString(findIntersection(
                new int[] { 5, 5, 5 },
                new int[] { 5, 5, 5 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] { 1, 1, 2, 2, 3 },
                new int[] { 2, 2, 3, 3, 4 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] { -1, -2, -3 },
                new int[] { -3, -4, -5 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] { 10 },
                new int[] { 10 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] { 10 },
                new int[] { 20 })));

        System.out.println(Arrays.toString(findIntersection(
                new int[] { 1, 2, 3, 4, 5, 6, 7 },
                new int[] { 6 })));
    }
}
