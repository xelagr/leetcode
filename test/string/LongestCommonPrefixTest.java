package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void test1() {
        assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void test2() {
        assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void test3() {
        assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{}));
    }

    @Test
    public void test4() {
        assertEquals("dog", new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog"}));
    }
}
