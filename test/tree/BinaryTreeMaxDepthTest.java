package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeMaxDepthTest extends BaseBinaryTreeTest {

    @Test
    public void test1() {
        assertEquals(3, new BinaryTreeMaxDepth().maxDepth(arrayToTree(new Integer[]{3,9,20,null,null,15,7})));
    }
}
