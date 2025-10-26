package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    private static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 1) {
                count++;
            }
            else if (nums[i+1] == nums[i]) {
            }
            else {
                count = 0;
            }
            result = Math.max(result, count);
        }
        return result + 1;
    }
}
