import java.util.Arrays;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;

        ListNode head = null, n = null;
        int prevExtra = 0, extra;
        do {
            int res = l1.val + l2.val + prevExtra;
            if (res >= 10) {
                extra = 1;
                res %= 10;
            }
            else {
                extra = 0;
            }

            if (n != null) {
                n.next = new ListNode(res);
                n = n.next;
            }
            else {
                head = n = new ListNode(res);
            }

            prevExtra = extra;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null && l2 != null);

        ListNode rest = l1 == null ? l2 : l1;
        if (rest != null) {
            do {
                int res = rest.val + prevExtra;
                if (res >= 10) {
                    extra = 1;
                    res %= 10;
                }
                else {
                    extra = 0;
                }
                n.next = new ListNode(res);
                prevExtra = extra;
                n = n.next;
                rest = rest.next;
            }
            while(rest != null);
        }

        if(prevExtra != 0) {
            n.next = new ListNode(prevExtra);
        }

        return head;
    }

    static ListNode createListNode(Iterable<Integer> ints) {
        ListNode prev = null;
        ListNode l = null;
        for (Integer i : ints) {
            if (prev == null) {
                l = prev = new ListNode(i);
            }
            else {
                prev.next = new ListNode(i);
                prev = prev.next;
            }
        }
        printListNode(l);
        return l;
    }

    private static void printListNode(ListNode l) {
        if (l == null) return;
        System.out.print(l.val);
        while (l.next != null) {
            l = l.next;
            System.out.print("->" + l.val);
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            ListNode l = this;
            sb.append(l.val);
            while (l.next != null) {
                sb.append(",").append(l.next.val);
                l = l.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}


