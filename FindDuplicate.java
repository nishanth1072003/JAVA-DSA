import java.util.*;

public class FindDuplicate {
    public static boolean hasDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = hasDuplicates(arr);
        System.out.println(result);
    }
}
