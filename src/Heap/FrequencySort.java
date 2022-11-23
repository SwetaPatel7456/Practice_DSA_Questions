package Heap;

import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {
        int a[] ={1,1,1,3,3,4,5};
        sort(a);

    }

    public static void sort(int a[]){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<a.length;i++){

            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else{
                int j = map.get(a[i]);
                map.put(a[i],j+1);
            }
        }
        System.out.println(map.keySet());
        //now map is ready
//        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(Collections.reverseOrder());
//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//            System.out.println(entry);
//            queue.add(new Pair(entry.getValue(), entry.getKey()));
//        }
//        int k =0;
//        List<Integer> ans = new ArrayList<>();
//        while (!queue.isEmpty()){
//            Pair temp = queue.poll();
//            int first = temp.key;
//            int second = temp.value;
//            System.out.println(first + " " + second);
//           for(int h = 0;h<first;h++){
//               ans.add(second);
//           }
//        }
//        System.out.println(ans);
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list ,(c,d)->{
            System.out.println(c);
            System.out.println(d);
            if(map.get(c)==map.get(d)){
                return d  - c;
            }
            else {
                return map.get(c) -map.get(d);
            }
        });
        List<Integer> ans = new ArrayList<>();
        for(Integer element :list){
            for(int i=1;i<=map.get(element);i++){
                ans.add(element);
            }
        }
        System.out.println(ans);
    }
}
