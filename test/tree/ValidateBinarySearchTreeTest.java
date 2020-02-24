package tree;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidateBinarySearchTreeTest extends BaseBinaryTreeTest {

    @Test
    public void test1(){
        assertTrue(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{2,1,3})));
    }

    @Test
    public void test2(){
        assertFalse(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{5,1,4,null,null,3,6})));
    }

    @Test
    public void test3(){
        assertTrue(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{})));
    }

    @Test
    public void test4(){
        assertFalse(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{10,5,15,null,null,6,20})));
    }

    @Test
    public void test5(){
        assertFalse(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{10,5,15,2,12,13,20})));
    }

    @Test
    public void test6(){
        assertTrue(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{10,5,15,2,9,13,20})));
    }

    @Test
    public void test7(){
        assertTrue(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{2147483647})));
    }

    @Test
    public void test8(){
        assertTrue(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{-2147483648,null,2147483647})));
    }

    @Test
    public void test9(){
        assertFalse(new ValidateBinarySearchTree().isValidBST(arrayToTree(new Integer[]{-2147483648,null,2147483647,2147483647,null})));
    }

}
