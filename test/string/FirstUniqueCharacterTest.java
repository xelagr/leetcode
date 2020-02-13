package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterTest {

    @Test
    public void test1() {
        assertEquals(0, new FirstUniqueCharacter().firstUniqChar("leetcode"));
    }

    @Test
    public void test2() {
        assertEquals(2, new FirstUniqueCharacter().firstUniqChar("loveleetcode"));
    }
}
