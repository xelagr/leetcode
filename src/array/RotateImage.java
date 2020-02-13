package array;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0, lo = 0, hi = n-1; i < n / 2 && lo < hi; i++, lo++, hi--) {
            for (int j = lo; j < hi; j++) {
                int from = matrix[i][j];
                int to = matrix[j][n-i-1];
                matrix[j][n-i-1] = from;

                from = to;
                to = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = from;

                from = to;
                to = matrix[n-j-1][i];
                matrix[n-j-1][i] = from;

                matrix[i][j] = to;
            }
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    public void rotate2(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotated[i][j];
            }
        }
    }
}
