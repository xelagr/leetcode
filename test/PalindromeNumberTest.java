import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeNumberTest {

    @Test
    public void test1() {
        assertTrue(new PalindromeNumber().isPalindrome(121));
    }

    @Test
    public void test2() {
        assertFalse(new PalindromeNumber().isPalindrome(-121));
    }

    @Test
    public void test3() {
        assertFalse(new PalindromeNumber().isPalindrome(10));
    }

    @Test
    public void test4() {
        assertTrue(new PalindromeNumber().isPalindrome(1221));
    }

    @Test
    public void test5() {
        assertTrue(new PalindromeNumber().isPalindrome(12321));
    }

    @Test
    public void test6() {
        assertTrue(new PalindromeNumber().isPalindrome(0));
    }

    @Test
    public void test7() {
        assertTrue(new PalindromeNumber().isPalindrome(1));
    }
}
