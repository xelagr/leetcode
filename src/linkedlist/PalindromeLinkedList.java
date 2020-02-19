package linkedlist;

public class PalindromeLinkedList {
    // complexity O(N), extra space O(1)
    public boolean isPalindrome(ListNode head) {
        ListNode slow, fast, prev = null;
        slow = fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode firstHalf = prev;
        ListNode secondHalf = fast == null ? slow : slow.next;

        while(firstHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // complexity O(N), extra space O(1)
    public boolean isPalindrome2(ListNode head) {
        int len = 0;
        ListNode node = head;
        while(node != null) {
            node = node.next;
            len++;
        }

        node = head;
        for (int i = 1; i <= len / 2; i++) {
            node = node.next;
        }

        ListNode prev = null;
        while(node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        ListNode tail = prev;
        for (int i = 1; i <= len / 2; i++) {
            if (head.val != tail.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
}
