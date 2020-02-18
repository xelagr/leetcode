package linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

    // complexity O(N), extra space O(1)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode node = head;
        while(node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    // complexity O(N), extra space O(N)
    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        LinkedList<ListNode> stack = new LinkedList<>();
        while(node != null) {
            stack.push(node);
            node = node.next;
        }
        head = node = stack.pop();
        while(!stack.isEmpty()) {
            node.next = stack.pop();
            node = node.next;
        }
        node.next = null;
        return head;
    }

    // complexity O(N), extra space O(N)
    public ListNode reverseList3(ListNode head) {
        if (head == null) {
            return null;
        }
        return internalReverse(head);
    }

    private ListNode internalReverse(ListNode head) {
        ListNode newHead = head;
        if (head.next != null) {
            newHead = internalReverse(head.next);
            head.next.next = head;
            head.next = null;
        }
        return newHead;
    }
}
