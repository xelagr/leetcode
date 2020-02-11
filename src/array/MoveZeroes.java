package array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int swaps = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(swaps);
    }

    public void moveZeroes2(int[] nums) {
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
