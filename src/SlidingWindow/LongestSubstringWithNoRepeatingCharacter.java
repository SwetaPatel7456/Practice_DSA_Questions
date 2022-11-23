package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithNoRepeatingCharacter {

    public static void main(String[] args) {
        String s = "aabacbebebe";
        System.out.println(solve(s,3));
    }

    public static int solve(String s,int k){
        int i =0;
        int j =0;
        int max =0;
        Map<Character,Integer> map = new HashMap<>();
        while (j<s.length()){

            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
            }
            else{
                int o = map.get(s.charAt(j));
                map.put(s.charAt(j),o+1);
            }
            if(map.size()==j-i+1){
                if(j-i+1>max){
                    max = j-i+1;
                }
                j++;
            }
            else if(map.size()<j-i+1){
                while (map.size()<j-i+1){
                    int n = map.get(s.charAt(i));
                    if(n>1){
                        map.put(s.charAt(i),n-1);
                    }
                    if(n==1){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }

        }
        return max;
    }
}
