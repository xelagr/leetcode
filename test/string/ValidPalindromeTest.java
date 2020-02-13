package string;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidPalindromeTest {

    @Test
    public void test1() {
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2() {
        assertFalse(new ValidPalindrome().isPalindrome("race a car"));
    }
}
