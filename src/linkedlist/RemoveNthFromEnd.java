package linkedlist;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        ListNode prev = head;
        while (node != null) {
            node = node.next;
            if (n-- < 0) {
                prev = prev.next;
            }
        }
        if (n == 0) {
            head =  head.next;
        }
        else if (prev.next.next == null) {
            prev.next = null;
        }
        else {
            prev.next = prev.next.next;
        }
        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        int i = 0;
        ListNode node = head;
        while (node != null) {
            i++;
            node = node.next;
        }
        node = head;
        int prev = i - n - 1;
        if (prev < 0) {
            return head.next;
        }
        for (i = 0; i != prev; i++) {
            node = node.next;
        }
        if (node.next.next == null) {
            node.next = null;
        }
        else {
            node.next = node.next.next;
        }
        return head;
    }
}
