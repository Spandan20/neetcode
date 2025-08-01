package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8};
        int target = 9;
        int result = removeElement(nums, target);
        System.out.println(result);
    }

    private static int removeElement(int[] nums, int target) {
        boolean flag = false;
        int rp = 0;
        int lp = 0;

        while (rp < nums.length) {
            if (nums[rp] == target) {
                if (!flag) {
                    lp = rp;
                    flag = true;
                }
                rp++;
                continue;
            }
            if (flag) {
                nums[lp] = nums[rp];
                lp++;
            }
            rp++;
        }
        for (int i = 0; i < lp; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return (flag) ? lp : nums.length;
    }
}
