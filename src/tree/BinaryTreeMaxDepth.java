package tree;

public class BinaryTreeMaxDepth {
    public int maxDepth(TreeNode root) {
        return maxDepth(0, root);
    }

    public int maxDepth(int depth, TreeNode node) {
        if (node == null) {
            return depth;
        }
        int leftDepth = maxDepth(depth+1, node.left);
        int rightDepth = maxDepth(depth+1, node.right);
        return Math.max(leftDepth, rightDepth);
    }
}
