package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LinkedListCycleTest extends BaseLinkedListTest {

    @Test
    public void test1() {
        ListNode head = arrayToList(new int[]{3, 2, 0, -4});
        findNode(head, -4).next = findNode(head, 2);
        assertTrue(new LinkedListCycle().hasCycle(head));
    }

    @Test
    public void test2() {
        ListNode head = arrayToList(new int[]{1, 2});
        findNode(head, 2).next = findNode(head, 1);
        assertTrue(new LinkedListCycle().hasCycle(head));
    }

    @Test
    public void test3() {
        ListNode head = arrayToList(new int[]{1});
        assertFalse(new LinkedListCycle().hasCycle(head));
    }
}
