import java.util.*;

public class twosum {
    public static int[] sum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return indices as an array directly
                }
            }
        }
        return new int[] { -1, -1 }; // If no pair is found, return {-1, -1}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] nums = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input the target value
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Call the sum method directly
        int[] result = sum(nums, target);

        // Print the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);

        /*
         * result[0]: This accesses the first element of the result array, which
         * corresponds to the index of the first number in the input array nums that
         * contributes to the target sum.
         * , : This string literal is used to separate the two indices being printed.
         * result[1]: This accesses the second element of the result array, which
         * corresponds to the index of the second number in the input array nums that
         * contributes to the target sum.
         */

        // Close the scanner
        sc.close();
    }
}
