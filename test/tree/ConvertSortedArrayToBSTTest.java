package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;


public class ConvertSortedArrayToBSTTest extends BaseBinaryTreeTest {

    @Test
    public void test1() {
        assertEquals(Arrays.asList(0,-10,5,null,-3,null,9), treeToArray(new ConvertSortedArrayToBST().sortedArrayToBST(new int[]{-10,-3,0,5,9})));
    }

    @Test
    public void test2() {
        assertEquals(Collections.emptyList(), treeToArray(new ConvertSortedArrayToBST().sortedArrayToBST(new int[]{})));
    }

    @Test
    public void test3() {
        assertEquals(Collections.singletonList(0), treeToArray(new ConvertSortedArrayToBST().sortedArrayToBST(new int[]{0})));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(0,null,1), treeToArray(new ConvertSortedArrayToBST().sortedArrayToBST(new int[]{0,1})));
    }
}
