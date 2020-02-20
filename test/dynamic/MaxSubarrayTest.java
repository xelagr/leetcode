package dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubarrayTest {

    @Test
    public void test1() {
        assertEquals(6, new MaxSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void test2() {
        assertEquals(3, new MaxSubarray().maxSubArray(new int[]{1,2}));
    }

    @Test
    public void test3() {
        assertEquals(21, new MaxSubarray().maxSubArray(new int[]{8,-19,5,-4,20}));
    }

    @Test
    public void test4() {
        assertEquals(-1, new MaxSubarray().maxSubArray(new int[]{-1,-1,-2,-2}));
    }

    @Test
    public void test5() {
        assertEquals(1, new MaxSubarray().maxSubArray(new int[]{-2,1}));
    }

    @Test
    public void test6() {
        assertEquals(1, new MaxSubarray().maxSubArray(new int[]{1,-2}));
    }
}
