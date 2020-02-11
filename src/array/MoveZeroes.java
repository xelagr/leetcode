package array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int swaps = 0;
        int end = nums.length;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i+1; j < end; j++) {
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                    swaps++;
                }
                end--;
            }
        }
        System.out.println(swaps);
    }
}
