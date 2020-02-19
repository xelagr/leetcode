package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeLinkedListTest extends BaseLinkedListTest{

    @Test
    public void test1() {
        assertFalse(new PalindromeLinkedList().isPalindrome(arrayToList(new int[]{1,2})));
    }

    @Test
    public void test2() {
        assertTrue(new PalindromeLinkedList().isPalindrome(arrayToList(new int[]{1,2,2,1})));
    }

    @Test
    public void test3() {
        assertTrue(new PalindromeLinkedList().isPalindrome(arrayToList(new int[]{1,2,1})));
    }

    @Test
    public void test4() {
        assertTrue(new PalindromeLinkedList().isPalindrome(arrayToList(new int[]{1})));
    }

    @Test
    public void test5() {
        assertTrue(new PalindromeLinkedList().isPalindrome(arrayToList(new int[]{})));
    }

    @Test
    public void test6() {
        assertFalse(new PalindromeLinkedList().isPalindrome(arrayToList(new int[]{1,2,3,4,5})));
    }

    @Test
    public void test7() {
        assertFalse(new PalindromeLinkedList().isPalindrome(arrayToList(new int[]{1,2,3,4})));
    }
}
