package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        boolean result = hasDuplicate(nums);
        System.out.println(result);
    }

    private static boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > 1) {
                return true;
            }
        }
        return false;
    }
}
