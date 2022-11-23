package MCM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxLengthOfStringWhileConcatenationUniqueChar {
    static String result ="";
    static Map<Character, Integer> map = new HashMap<Character, Integer>();

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        map.put('a',0);
        map.put('b',0);
        map.put('c',0);
        map.put('d',0);
        map.put('e',0);
        int max =0;
        list.add("ac");
        list.add("bd");
        list.add("ce");
        int m =-1;
        for(int i = 0;i< list.size();i++){
            solve(list,i);
            m = result.length();
            if(m>max){
                max = m;
                result="";
            }}
        System.out.println(max);
    }
    public static void  solve(List<String> list,int index){
        if(index== list.size()){
            return ;
        }
        String s = list.get(index);
        int flag =0;
        for(int i =0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 0){
                map.put(Character.valueOf(s.charAt(i)),1);
            }
            else if(map.get(s.charAt(i)) != 0){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            result=result+s;
        }
        solve(list,index+1);

    }
}
