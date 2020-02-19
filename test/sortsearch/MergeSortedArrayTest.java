package sortsearch;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    public void test1() {
        int[] nums1 = {1,2,3,0,0,0};
        new MergeSortedArray().merge(nums1, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    public void test2() {
        int[] nums1 = {4,5,6,0,0,0};
        new MergeSortedArray().merge(nums1, 3, new int[]{1,2,3}, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, nums1);
    }

    @Test
    public void test3() {
        int[] nums1 = {1,3,5,0,0,0};
        new MergeSortedArray().merge(nums1, 3, new int[]{2,4,6}, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, nums1);
    }

    @Test
    public void test4() {
        int[] nums1 = {2,4,6,0,0,0};
        new MergeSortedArray().merge(nums1, 3, new int[]{1,3,5}, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, nums1);
    }
}
