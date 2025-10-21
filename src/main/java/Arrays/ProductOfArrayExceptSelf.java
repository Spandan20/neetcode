package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] product = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(left));
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(right));
        for (int i = 0; i < nums.length; i++) {
            product[i] = left[i] * right[i];
        }

        return product;
    }
}
