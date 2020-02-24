package design;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    private int[] nums;

    public ArrayShuffle(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        int[] shuffled = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < shuffled.length; i++) {
            int j = random.nextInt(i + 1);
            swap(shuffled, i, j);
        }
        return shuffled;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
