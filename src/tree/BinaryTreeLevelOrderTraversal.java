package tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<List<Integer>> nodeValues = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int levelWidth;
        while(!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            levelWidth = queue.size();
            for (int i = 0; i < levelWidth; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            nodeValues.add(levelNodes);
        }
        return nodeValues;
    }
}
