package string;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidAnagramTest {

    @Test
    public void test1() {
        assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test2() {
        assertFalse(new ValidAnagram().isAnagram("rat", "car"));
    }
}
