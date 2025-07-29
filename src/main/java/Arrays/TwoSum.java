package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {5,5};
        int target = 10;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        int[] result = null;
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (hash.containsKey(compliment)) {
                result = new int[]{hash.get(compliment), i};
                break;
            } else {
                hash.put(nums[i], i);
            }
        }
        return result;
    }
}
