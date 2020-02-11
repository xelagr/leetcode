package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void test1() {
        int[] actual = {0,1,0,3,12};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(new int[]{1,3,12,0,0}, actual);
    }

    @Test
    public void test2() {
        int[] actual = {0,0,0,0,1};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(new int[]{1,0,0,0,0}, actual);
    }

}
