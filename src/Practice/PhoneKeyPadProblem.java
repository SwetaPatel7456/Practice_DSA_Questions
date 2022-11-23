package Practice;

import java.util.*;

public class PhoneKeyPadProblem {
    static  Map<Character,String> map = new HashMap<>();


    public static void main(String[] args) {
        map.put('1',"abc");
        map.put('2',"def");
        map.put('3',"ghi");
        List<String> list = solve("1",0);
        System.out.println(list);
        System.out.println(list.size());
    }

    public static List<String> solve(String input,int index){
        if(index==input.length()-1){
            List<String> list = new ArrayList<>();
            String value = map.get(input.charAt(index));
            for(int i =0;i<value.length();i++){
                list.add(String.valueOf(value.charAt(i)));
            }
            return list;
        }
        List<String> list = solve(input,index+1);
        List<String> newList= new ArrayList<>();
        String value = map.get(input.charAt(index));
        for (int i = 0;i<value.length();i++){
            for (int j =0;j<list.size();j++){
                String new1 = value.charAt(i) + list.get(j);
                newList.add(new1);
            }
        }
        return newList;
    }


}
