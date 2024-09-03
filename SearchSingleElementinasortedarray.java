
//Given an array of N integers. Every number in the array except one appears twice. Find the single number in the array.
import java.util.*;

public class SearchSingleElementinasortedarray {

    public static int singleElement(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        // If no single element is found in the loop, the single element is the last one
        return arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8 };
        SearchSingleElementinasortedarray sol = new SearchSingleElementinasortedarray();
        System.out.println(sol.singleElement(arr));
    }

}
