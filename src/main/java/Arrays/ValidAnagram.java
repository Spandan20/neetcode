package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "jar";
        String t = "jarrr";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    private static boolean isAnagram(String s, String t) {
        Map<Character, Integer> char1 = new HashMap<>();
        Map<Character, Integer> char2 = new HashMap<>();
        for (char i : s.toCharArray()) {
            char1.put(i, char1.getOrDefault(i, 0) + 1);
        }
        for (char i : t.toCharArray()) {
            char2.put(i, char2.getOrDefault(i, 0) + 1);
        }
        if (char2.equals(char1)) return true;
        return false;
    }
}
