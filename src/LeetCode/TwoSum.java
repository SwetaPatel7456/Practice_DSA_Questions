package LeetCode;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,4};
        //int c[] = sumUsingHashMap(a,4);
       // System.out.println(Arrays.toString(c));
        int c[] = sumUsingHashMapIfDuplicatesPresent(a,8);
        System.out.println(Arrays.toString(c));

    }
    public static int[] sumUsingHashMap(Integer a[],int target){
        Map<Integer,Integer> map = new HashMap<>();
        int b[] = new int[2];
         for(int i =0;i<a.length;i++){
             int num = target -a[i];
             if(map.containsKey(num)){
                 return new int[]{i,map.get(num)};
             }
             else
                 map.put(a[i],i);
         }
        System.out.println(b[0]);
        System.out.println(b[1]);
         return b;
    }

    public static int[] sumUsingHashMapIfDuplicatesPresent(Integer a[],int target){
        Map<Integer,List<Integer>> map = new HashMap<>();
        int b[] = new int[2];
        for(int i =0;i<a.length;i++){
            int num = target -a[i];
            if(map.containsKey(num)){
                List<Integer> index= map.get(num);
                for(Integer l : index){
                    if(l!=i){
                        return new int[]{i,l};
                    }
                }
            }
            else{
                if(map.containsKey(a[i])){
                    List<Integer> list1 = map.get(a[i]);
                    list1.add(i);
                    map.put(a[i],list1);
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(a[i], list);
                }
            }
        }
        //System.out.println(b[0]);
        //System.out.println(b[1]);
        return b;
    }
}
