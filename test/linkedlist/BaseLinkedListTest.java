package linkedlist;

import java.util.ArrayList;

public class BaseLinkedListTest {
    ListNode arrayToList(int[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        ListNode head, node;
        head = node = new ListNode(a[0]);
        for (int i = 1; i < a.length; i++) {
            ListNode newNode = new ListNode(a[i]);
            node.next = newNode;
            node = newNode;
        }
        return head;
    }

    ListNode findNode(ListNode node, int val) {
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    Integer[] listToArray(ListNode node) {
        if (node == null) {
            return new Integer[]{};
        }
        ArrayList<Integer> integers = new ArrayList<>();
        do {
            integers.add(node.val);
            node = node.next;
        } while (node != null);
        return integers.toArray(new Integer[0]);
    }
}
