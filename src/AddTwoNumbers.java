import java.util.Arrays;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long n1 = createNumber(l1);
        System.out.println(n1);
        long n2 = createNumber(l2);
        System.out.println(n2);
        long r = n1 + n2;
        final ListNode rn = new ListNode((int)(r % 10));
        while(r >= 10) {
            rn.next = new ListNode((int)(r % 10));
            r /= 10;
        }
        return rn;
    }

    long createNumber(ListNode l) {
        long n = l.val;
        int pow = 1;
        while(l.next != null) {
            l = l.next;
            n += l.val * Math.pow(10, pow);
            pow++;
        }
        return n;
    }

    public static void main(String[] args) {
        final ListNode l1 = createListNode(Arrays.asList(2, 4, 3));
        final ListNode l2 = createListNode(Arrays.asList(5, 6, 4));
        new AddTwoNumbers().addTwoNumbers(l1, l2);
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

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


