package tree;

import java.util.*;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Deque<TreeNode> left = new LinkedList<>(), right = new LinkedList<>();
        left.push(root.left);
        right.push(root.right);
        while(!left.isEmpty() && !right.isEmpty()) {
            TreeNode lNode = left.pop();
            TreeNode rNode = right.pop();
            if (lNode == null && rNode == null) continue;
            if (lNode == null || rNode == null || (lNode.val != rNode.val)) return false;
            left.push(lNode.left);
            left.push(lNode.right);
            right.push(rNode.right);
            right.push(rNode.left);
        }
        return left.isEmpty() && right.isEmpty();
    }

    public boolean isSymmetric2(TreeNode root) {
        if (root == null) return true;
        List<Integer> left = new ArrayList<>(), right = new ArrayList<>();
        traverseLeft(root.left, left);
        traverseRight(root.right, right);
        return left.equals(right);
    }

    private void traverseLeft(TreeNode root, List<Integer> values) {
        if (root == null) {
            values.add(null);
        }
        else {
            values.add(root.val);
            traverseLeft(root.left, values);
            traverseLeft(root.right, values);
        }
    }

    private void traverseRight(TreeNode root, List<Integer> values) {
        if (root == null) {
            values.add(null);
        }
        else {
            values.add(root.val);
            traverseRight(root.right, values);
            traverseRight(root.left, values);
        }
    }
}
