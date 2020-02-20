package dynamic;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0], maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }

    //complexity O(N), extra space O(1)
    public int maxSubArray2(int[] nums) {
        int i = 1;
        int sum = nums[0], max = nums[0];
        while(i < nums.length) {
            if (sum >= 0 || sum > nums[i]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > max) {
                max = sum;
            }
            i++;
        }
        return max;
    }
}
