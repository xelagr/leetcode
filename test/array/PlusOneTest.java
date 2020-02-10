package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,2,4}, new PlusOne().plusOne(new int[]{1,2,3}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,0}, new PlusOne().plusOne(new int[]{9}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1,0,0}, new PlusOne().plusOne(new int[]{9,9}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{1,0,2,0,0}, new PlusOne().plusOne(new int[]{1,0,1,9,9}));
    }
}
