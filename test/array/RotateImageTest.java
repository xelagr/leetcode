package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateImageTest {

    @Test
    public void test1() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] rotated = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        new RotateImage().rotate(matrix);
        assertArrayEquals(rotated, matrix);
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        int[][] rotated = new int[][]{
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        new RotateImage().rotate(matrix);
        assertArrayEquals(rotated, matrix);
    }

}
