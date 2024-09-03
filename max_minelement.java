import java.util.Scanner;

public class max_minelement {

    public static void main(String[] args) {
        int n = 10; // Assuming you want to read 10 elements
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);

        // Reading elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the elements in the array
        System.out.println("Entered elements:");
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }

        // Finding the minimum and maximum elements
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // Printing the minimum and maximum elements
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
}

