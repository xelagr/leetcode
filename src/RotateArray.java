public class RotateArray {

    //much faster - O(N), and requires only O(1) extra space
    public void rotateInPlace(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int count = 0;
        for (int start = 0; count < len; start++) {
            int prev = nums[start];
            int current = start;
            do {
                current = (current + k) % len;
                int tmp = nums[current];
                nums[current] = prev;
                prev = tmp;
                count++;
            } while (start != current);
        }
    }

    //much faster - O(N), and requires no extra space
    public void rotateUsingReverse(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    //much faster - O(N), but required O(N) extra space
    public void rotateUseExtraSpace(int[] nums, int k) {
        int[] rotated = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = (i + k) % nums.length;
            rotated[j] = nums[i];
        }
        System.arraycopy(rotated, 0, nums, 0, rotated.length);
    }

    //stupid slow O(N*K) version, extra space O(1)
    public void rotateSlow(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length-1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = last;
//            System.out.println(Arrays.toString(nums));
        }
    }


}
