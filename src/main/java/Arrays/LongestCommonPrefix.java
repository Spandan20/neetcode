package Arrays;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"neet","feet"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty()) return "";
        if (strs.length == 1) return strs[0];

        Arrays.sort(strs);

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                return strs[0].substring(0,i);
            }
        }

        return strs[0];

//        String result = "";
//        char[] str1 = strs[0].toCharArray();
//        char[] str2 = strs[strs.length - 1].toCharArray();

//        for (int i = 0; i < str1.length; i++) {
//            if (str1[i] == str2[i]) {
//                result += str1[i];
//            } else {
//                break;
//            }
//        }
    }
}
