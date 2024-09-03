import java.util.*;

public class findduplicateno {
    public static int duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {

            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        findduplicateno dup = new findduplicateno();
        int[] nums = { 1, 2, 3, 2, 5 };
        System.out.println(dup.duplicate(nums));
    }
}
