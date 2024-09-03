import java.util.Scanner;

public class transpose_of_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input matrix dimensions
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // Input matrix elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix
        int[][] transposeArr = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposeArr[i][j] = arr[j][i];
            }
        }

        // Print the transposed matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposeArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


