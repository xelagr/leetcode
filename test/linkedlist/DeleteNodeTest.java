package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DeleteNodeTest extends BaseLinkedListTest {

    @Test
    public void test1() {
        ListNode head = arrayToList(new int[]{4,5,1,9});
        ListNode n5 = findNode(head, 5);
        new DeleteNode().deleteNode(n5);
        assertArrayEquals(new Integer[]{4,1,9}, listToArray(head));
    }


}
