package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BinaryTreeLevelOrderTraversalTest extends BaseBinaryTreeTest {

    @Test
    public void test1() {
        List<List<Integer>> expected = new ArrayList<>();
        for(Integer[] a : new Integer[][]{{3}, {9, 20}, {15, 7}}) {
            expected.add(Arrays.asList(a));
        }
        assertEquals(expected, new BinaryTreeLevelOrderTraversal().levelOrder(arrayToTree(new Integer[]{3,9,20,null,null,15,7})));
    }
}
