package tree;

import org.junit.Test;

import java.util.*;

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

    protected List<Integer> treeToArray(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            else {
                list.add(null);
            }
        }
        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasPrevious() && it.previous() == null) {
            it.remove();
        }

        return list;
    }

}
