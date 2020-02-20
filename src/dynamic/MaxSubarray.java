package dynamic;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int i = 1;
        int sum = nums[0], max = nums[0];
        while(i < nums.length) {
            if (sum < 0 && nums[i] > sum) {
                sum = nums[i];
            }
            else {
                sum += nums[i];
            }
            if (sum > max) {
                max = sum;
            }
            i++;
        }
        return max;
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
