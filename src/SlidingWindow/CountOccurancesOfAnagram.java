package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountOccurancesOfAnagram {
    public static void main(String[] args) {

    }
    public static int countOccurances(String s,String pattern) {
        int j = 0;
        int i = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int k = 0; k < pattern.length(); k++) {
            if (!map.containsKey(pattern.charAt(k))) {
                map.put(pattern.charAt(k), 1);
            } else {
                int previousvalue = map.get(pattern.charAt(k));
                map.put(pattern.charAt(k), previousvalue + 1);
            }
        }
        int count = map.size();

        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                int g = map.get(s.charAt(j));
                map.put(s.charAt(j), g - 1);
              //  if()
            }
            if (j - i + 1 < pattern.length()) {
                j++;
            } else if (j - i + 1 == pattern.length()) {

            }
        }
        return 0;
    }
}
