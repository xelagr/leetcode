package dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClimbingStairsTest {

    @Test
    public void test2() {
        assertEquals(1, new ClimbingStairs().climbStairs(1));
    }

    @Test
    public void test3() {
        assertEquals(2, new ClimbingStairs().climbStairs(2));
    }

    @Test
    public void test4() {
        assertEquals(3, new ClimbingStairs().climbStairs(3));
    }

    @Test
    public void test5() {
        long t1 = System.currentTimeMillis();
        assertEquals(1134903170, new ClimbingStairs().climbStairs(44));
        long total = System.currentTimeMillis() - t1;
        int expected = 1000;
        assertTrue(String.format("Expected running time is less than %d ms, but was %d ms", expected, total), total < expected);
    }
}
