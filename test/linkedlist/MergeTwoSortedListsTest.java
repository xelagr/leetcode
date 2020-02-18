package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeTwoSortedListsTest extends BaseLinkedListTest{

    @Test
    public void test1() {
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(arrayToList(new int[]{1,2,4}), arrayToList(new int[]{1,3,4}));
        assertArrayEquals(new Integer[]{1,1,2,3,4,4}, listToArray(result));
    }
}
