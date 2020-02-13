package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerTest {
    @Test
    public void test1() {
        assertEquals(42, new StringToInteger().myAtoi("42"));
    }

    @Test
    public void test2() {
        assertEquals(-42, new StringToInteger().myAtoi("   -42"));
    }

    @Test
    public void test3() {
        assertEquals(4193, new StringToInteger().myAtoi("4193 with words"));
    }

    @Test
    public void test4() {
        assertEquals(0, new StringToInteger().myAtoi("words and 987"));
    }

    @Test
    public void test5() {
        assertEquals(-2147483648, new StringToInteger().myAtoi("-91283472332"));
    }
}
