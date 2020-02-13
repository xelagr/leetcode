package string;

import org.junit.Test;
import string.ReverseInteger;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void test1() {
        assertEquals(321, new ReverseInteger().reverse(123));
    }

    @Test
    public void test2() {
        assertEquals(321, new ReverseInteger().reverse(123));
    }

    @Test
    public void test3() {
        assertEquals(-321, new ReverseInteger().reverse(-123));
    }

    @Test
    public void test4() {
        assertEquals(21, new ReverseInteger().reverse(120));
    }

    @Test
    public void test5() {
        assertEquals(0, new ReverseInteger().reverse(0));
    }

    @Test
    public void test6() {
        assertEquals(0, new ReverseInteger().reverse(Integer.MAX_VALUE));
    }

    @Test
    public void test7() {
        assertEquals(0, new ReverseInteger().reverse(Integer.MIN_VALUE));
    }
}
