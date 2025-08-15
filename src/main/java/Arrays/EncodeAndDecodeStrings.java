package Arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> strs = List.of(new String[]{""});
        String encodedStr = encode(strs);
        List<String> decodedStr = decode(encodedStr);
        System.out.println(decodedStr);


    }

    private static String encode(List<String> strs) {
        String encodedStr = "";
        for (String str : strs) {
            encodedStr += str.length() + "#" + str;
        }
        return encodedStr;
    }

    private static List<String> decode(String str) {
        List<String> decodedStr = new ArrayList<>(List.of());
        int i = 0;
        String wordLength = "";
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                wordLength += str.charAt(i);
                i++;
            }
            else if (str.charAt(i) == '#') {
                int wordlist = Integer.parseInt(wordLength);
                if (wordlist >= 0) {
                    decodedStr.add(str.substring(i+1, i+wordlist+1));
                    wordLength = "";
                    i += wordlist + 1;
                }else {
                    i++;
                }
            }
        }
        return decodedStr;
    }
}
