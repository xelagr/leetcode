package tree;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SymmetricTreeTest extends BaseBinaryTreeTest{

    @Test
    public void test1() {
        assertTrue(new SymmetricTree().isSymmetric(arrayToTree(new Integer[]{1,2,2,3,4,4,3})));
    }

    @Test
    public void test2() {
        assertFalse(new SymmetricTree().isSymmetric(arrayToTree(new Integer[]{1,2,2,null,3,null,3})));
    }

    @Test
    public void test3() {
        assertTrue(new SymmetricTree().isSymmetric(arrayToTree(new Integer[]{})));
    }

    @Test
    public void test4() {
        assertTrue(new SymmetricTree().isSymmetric(arrayToTree(new Integer[]{1,2,2})));
    }
}
