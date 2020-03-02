package tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<List<Integer>> nodeValues = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int levelWidth = 1;
        while(!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int nextLevelWidth = 0;
            for (int i = 0; i < levelWidth; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                    nextLevelWidth++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    nextLevelWidth++;
                }
            }
            levelWidth = nextLevelWidth;
            nodeValues.add(levelNodes);
        }
        return nodeValues;
    }
}
