package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveNthFromEndTest extends BaseLinkedListTest {

    @Test
    public void test1() {
        ListNode head = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result = new RemoveNthFromEnd().removeNthFromEnd(head, 2);
        assertArrayEquals(new Integer[]{1,2,3,5}, listToArray(result));
    }

    @Test
    public void test2() {
        ListNode head = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result = new RemoveNthFromEnd().removeNthFromEnd(head, 1);
        assertArrayEquals(new Integer[]{1,2,3,4}, listToArray(result));
    }

    @Test
    public void test3() {
        ListNode head = arrayToList(new int[]{1});
        ListNode result = new RemoveNthFromEnd().removeNthFromEnd(head, 1);
        assertArrayEquals(new Integer[]{}, listToArray(result));
    }

    @Test
    public void test4() {
        ListNode head = arrayToList(new int[]{1,2});
        ListNode result = new RemoveNthFromEnd().removeNthFromEnd(head, 2);
        assertArrayEquals(new Integer[]{2}, listToArray(result));
    }

    @Test
    public void test5() {
        ListNode head = arrayToList(new int[]{1,2});
        ListNode result = new RemoveNthFromEnd().removeNthFromEnd(head, 1);
        assertArrayEquals(new Integer[]{1}, listToArray(result));
    }
}
