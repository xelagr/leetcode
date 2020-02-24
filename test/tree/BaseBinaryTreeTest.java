package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BaseBinaryTreeTest {

    protected TreeNode arrayToTree(Integer[] a) {
        if (a.length == 0) return null;
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode head = new TreeNode(a[0]);
        queue.add(head);
        for (int i = 1; i < a.length; i += 2) {
            TreeNode node = queue.remove();
            if (a[i] != null) {
                node.left = new TreeNode(a[i]);
                queue.add(node.left);
            }
            if (a[i+1] != null) {
                node.right = new TreeNode(a[i + 1]);
                queue.add(node.right);
            }
        }
        return head;
    }
}
