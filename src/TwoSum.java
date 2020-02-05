import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementaryNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complementaryNums.containsKey(nums[i]) && i != complementaryNums.get(nums[i])) {
                return new int[]{complementaryNums.get(nums[i]), i};
            }
            complementaryNums.put(target - nums[i], i);
        }
        return null;
    }
}
