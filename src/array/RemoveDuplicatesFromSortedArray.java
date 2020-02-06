package array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int dupNum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                dupNum++;
            }
            nums[i-dupNum] = nums[i];
        }
        return nums.length - dupNum;
    }
}
