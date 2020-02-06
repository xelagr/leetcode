package array;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        return n;
    }

    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                count++;
            }
            else {
                if (count == 1) return prev;
                count = 1;
                prev = nums[i];
            }
        }
        return prev;
    }
}
