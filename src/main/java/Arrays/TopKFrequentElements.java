package Arrays;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[k];
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num,0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            if (i < k) {
                result[i++] = entry.getKey();
            }
//            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        return result;
    }
}
