package Arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {5,5,1,1,1,5,5};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    private static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int curr = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curr) {
                count++;
            }
            else {
                count = 1;
                curr = nums[i];
            }
            if (count > nums.length/2) break;
        }
        return curr;
    }
}


/*
* This can be solved much more easily
* The fact that we are checking for an element that occurs > N/2
* automatically means that after sorting the array the majority
* element must lie at index n/2
* i.e return nums[nums.length/2]
*
* Another wonderful approach is using moore's voting algorithm
*
*/
