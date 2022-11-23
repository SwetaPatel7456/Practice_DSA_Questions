package SlidingWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaximumOfallSubArraySizeK {


    public static void main(String[] args) {

        int a[] = {1,2,3,2,2,1};
        maximumOfallSubArraySizeK(a,3);

    }

    public static void  maximumOfallSubArraySizeK(int a[],int k){

        int i =0;
        int j =0;
        int max =Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int index=-1;
        while(j<a.length){
            Iterator<Integer> iterator = list.iterator();

            if(list.size()!=0) {
                while (iterator.hasNext()){
                    Integer n = iterator.next();
                    if(n<a[j]){
                        iterator.remove();
                    }
                   // iterator = list.iterator();
                }
                }

           list.add(a[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                System.out.println(list.get(0));
                if(a[i]==list.get(0)){
                    list.remove(list.get(0));
                }
                i++;
                j++;
            }
        }
        System.out.println(list);

    }
}
