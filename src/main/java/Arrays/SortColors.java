package Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int j = 0, k, m;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[j];
                nums[j++] = 0;
            }
        }
        k = j;
        for (int i = j; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = nums[k];
                nums[k++] = 1;
            }
        }
        m = k;
        for (int i = m; i < nums.length; i++) {
            if (nums[i] == 2) {
                nums[i] = nums[m];
                nums[m++] = 2;
            }
        }
    }
}
