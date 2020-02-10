package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoArraysIntersectionTest {

    @Test
    public void test1() {
        int[] actual = new TwoArraysIntersection().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        Arrays.sort(actual);
        int[] expected = {2, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] actual = new TwoArraysIntersection().intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        Arrays.sort(actual);
        int[] expected = {4, 9};
        assertArrayEquals(expected, actual);
    }
}
