package Arrays;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] result = sortArray(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length -1);
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] left = Arrays.copyOfRange(nums, low, mid+1);
        int[] right = Arrays.copyOfRange(nums, mid+1 , high + 1);
        int i = 0, j = 0, k = low;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        while (i < left.length) nums[k++] = left[i++];
        while (j < right.length) nums[k++] = right[j++];
    }

    private static int[] mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low)/2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }
}
