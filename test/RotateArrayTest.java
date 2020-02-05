import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void test1() {
        final int[] expected = {5, 6, 7, 1, 2, 3, 4};
        final int[] a = {1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotateInPlace(a, 3);
        assertArrayEquals(expected, a);
    }

    @Test
    public void test2() {
        final int[] expected = {3,4,1,2};
        final int[] a = {1,2,3,4};
        new RotateArray().rotateInPlace(a, 2);
        assertArrayEquals(expected, a);
    }

    @Test
    public void test3() {
        final int[] expected = {2,3,4,1};
        final int[] a = {1,2,3,4};
        new RotateArray().rotateInPlace(a, 3);
        assertArrayEquals(expected, a);
    }

    @Test
    public void test4() {
        final int[] expected = {1,2};
        final int[] a = {1,2};
        new RotateArray().rotateInPlace(a, 2);
        assertArrayEquals(expected, a);
    }

    @Test
    public void test5() {
        final int[] expected = {3,4,5,6,1,2};
        final int[] a = {1,2,3,4,5,6};
        new RotateArray().rotateInPlace(a, 4);
        assertArrayEquals(expected, a);
    }

    @Test
    public void test6() {
        final int[] expected = {1};
        final int[] a = {1};
        new RotateArray().rotateInPlace(a, 0);
        assertArrayEquals(expected, a);
    }

    @Test
    public void test7() {
        final int[] expected = {1};
        final int[] a = {1};
        new RotateArray().rotateInPlace(a, 1);
        assertArrayEquals(expected, a);
    }

    @Test
    public void test8() {
        final int[] expected = {4,5,6,1,2,3};
        final int[] a = {1,2,3,4,5,6};
        new RotateArray().rotateInPlace(a, 3);
        assertArrayEquals(expected, a);
    }

}
