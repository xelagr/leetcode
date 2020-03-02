package tree;

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return createNode(nums, 0, nums.length-1);
    }

    private TreeNode createNode(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = lo + (hi - lo) / 2;
        TreeNode parent = new TreeNode(nums[mid]);
        parent.left = createNode(nums, lo, mid-1);
        parent.right = createNode(nums, mid+1, hi);
        return parent;
    }
}
