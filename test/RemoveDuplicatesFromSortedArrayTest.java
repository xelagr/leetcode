import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test1() {
        final int[] a = {1, 1, 2};
        final int len = new RemoveDuplicatesFromSortedArray().removeDuplicates(a);
        printArray(a, len);
        assertEquals(2, len);
    }

    @Test
    public void test2() {
        final int[] a = {0,0,1,1,1,2,2,3,3,4};
        final int len = new RemoveDuplicatesFromSortedArray().removeDuplicates(a);
        printArray(a, len);
        assertEquals(5, len);
    }

    private void printArray(int[] a, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
