package string;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringTest {

    @Test
    public void test1() {
        char[] actual = {'h','e','l','l','o'};
        new ReverseString().reverseString(actual);
        assertArrayEquals(new char[]{'o','l','l','e','h'}, actual);
    }

    @Test
    public void test2() {
        char[] actual = {'H','a','n','n','a','h'};
        new ReverseString().reverseString(actual);
        assertArrayEquals(new char[]{'h','a','n','n','a','H'}, actual);
    }
}
