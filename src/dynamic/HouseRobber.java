package dynamic;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] maxSums = new int[nums.length];
        Arrays.fill(maxSums, -1);

        return Math.max(rob(nums, 0, maxSums), rob(nums, 1, maxSums));
    }

    private int rob(int[] nums, int i, int[] maxSums) {
        if (maxSums[i] >= 0) {
            return maxSums[i];
        }
        int max2 = nums[i], max3 = nums[i];
        if (i < nums.length-2) {
            max2 = nums[i] + rob(nums, i+2, maxSums);
        }
        if (i < nums.length-3) {
            max3 = nums[i] + rob(nums, i+3, maxSums);
        }
        int max = Math.max(max2, max3);
        maxSums[i] = max;
        return max;
    }

}
