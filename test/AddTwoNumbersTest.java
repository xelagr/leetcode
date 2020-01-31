import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    @Test
    public void testSimple() {
        final AddTwoNumbers.ListNode l1 = AddTwoNumbers.createListNode(Arrays.asList(2, 4, 3));
        final AddTwoNumbers.ListNode l2 = AddTwoNumbers.createListNode(Arrays.asList(5, 6, 4));
        final AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[7,0,8]", listNode.toString());
    }

    @Test
    public void testOverflow() {
        final AddTwoNumbers.ListNode l1 = AddTwoNumbers.createListNode(Arrays.asList(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1));
        final AddTwoNumbers.ListNode l2 = AddTwoNumbers.createListNode(Arrays.asList(5, 6, 4));
        final AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", listNode.toString());
    }

    @Test
    public void testSingleDigit() {
        final AddTwoNumbers.ListNode l1 = AddTwoNumbers.createListNode(Arrays.asList(5));
        final AddTwoNumbers.ListNode l2 = AddTwoNumbers.createListNode(Arrays.asList(5));
        final AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,1]", listNode.toString());
    }

    @Test
    public void testLimits() {
        final AddTwoNumbers.ListNode l1 = AddTwoNumbers.createListNode(Arrays.asList(1));
        final AddTwoNumbers.ListNode l2 = AddTwoNumbers.createListNode(Arrays.asList(9,9));
        final AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,0,1]", listNode.toString());
    }

    @Test
    public void testLimits2() {
        final AddTwoNumbers.ListNode l1 = AddTwoNumbers.createListNode(Arrays.asList(1));
        final AddTwoNumbers.ListNode l2 = AddTwoNumbers.createListNode(Arrays.asList(9,9,9));
        final AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,0,0,1]", listNode.toString());
    }

    @Test
    public void testLimits3() {
        final AddTwoNumbers.ListNode l1 = AddTwoNumbers.createListNode(Arrays.asList(0,1));
        final AddTwoNumbers.ListNode l2 = AddTwoNumbers.createListNode(Arrays.asList(0,9));
        final AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,0,1]", listNode.toString());
    }
}
