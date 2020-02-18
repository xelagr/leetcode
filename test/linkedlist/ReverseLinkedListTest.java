package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseLinkedListTest extends BaseLinkedListTest {

    @Test
    public void test1() {
        ListNode result = new ReverseLinkedList().reverseList(arrayToList(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new Integer[]{5,4,3,2,1}, listToArray(result));
    }

    @Test
    public void test2() {
        ListNode result = new ReverseLinkedList().reverseList(arrayToList(new int[]{}));
        assertArrayEquals(new Integer[]{}, listToArray(result));
    }
}
