import java.util.*;

public class K_th_elementoftwosortedarrays {
    public static int Kthelement(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        int l = n + m;
        List<Integer> nums3 = new ArrayList<>();
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                nums3.add(nums1[i++]);
            } else {
                nums3.add(nums2[j++]);
            }
            while (i < n) {
                nums3.add(nums1[i++]);
            }
            while (j < n) {
                nums3.add(nums2[j++]);
            }

        }
        Integer[] mergedArray = nums3.toArray(new Integer[0]);
        return mergedArray[k - 1];// return kth element

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5 };
        int[] nums2 = { 2, 4, 6, 8 };
        int k = 5;
        System.out.println("The k-th element is: " + Kthelement(nums1, nums2, k));
    }
}
