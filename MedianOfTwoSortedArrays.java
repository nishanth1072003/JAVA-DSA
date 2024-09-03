import java.util.*;

public class MedianOfTwoSortedArrays {

    public static double findMedian(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> nums3 = new ArrayList<>();

        int i = 0, j = 0;
        // Merge two sorted arrays
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                nums3.add(nums1[i++]);
            } else {
                nums3.add(nums2[j++]);
            }
        }
        // Add remaining elements of nums1
        while (i < n) {
            nums3.add(nums1[i++]);
        }
        // Add remaining elements of nums2
        while (j < m) {
            nums3.add(nums2[j++]);
        }

        int totalLength = n + m;
        int middle = totalLength / 2;

        if (totalLength % 2 == 1) {
            return nums3.get(middle); // Odd median
        } else {
            return (nums3.get(middle - 1) + nums3.get(middle)) / 2.0; // Even median
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 4, 5, 6, 7 };
        System.out.println(findMedian(nums1, nums2)); // Print the median
    }
}
