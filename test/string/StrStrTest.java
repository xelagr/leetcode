package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrStrTest {

    @Test
    public void test1() {
        assertEquals(2, new StrStr().strStr("hello", "ll"));
    }

    @Test
    public void test2() {
        assertEquals(-1, new StrStr().strStr("aaaaa", "bba"));
    }
}
