package tree;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return inRange(root, null, null);
    }

    private boolean inRange(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min == null || node.val > min) && (max == null || node.val < max)) {
            return inRange(node.left, min, node.val) && inRange(node.right, node.val, max);
        }
        return false;
    }
}
