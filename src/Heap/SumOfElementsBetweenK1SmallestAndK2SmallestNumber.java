package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class SumOfElementsBetweenK1SmallestAndK2SmallestNumber {

    public static void main(String[] args) {
        int k1=3;
        int k2=6;
        int a[] ={1,3,12,5,15,11};

        int first =  kthSmallest(a,k1);
        int second =  kthSmallest(a,k2);

        int i =0;
        int sum =0;
        while (i<a.length){
            if(a[i]>first && a[i]<second){
                sum=sum+a[i];
            }
            i++;
        }
        System.out.println(sum);
    }

    private static int kthSmallest(int[] a, int k) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0;i<a.length;i++){
            priorityQueue.add(a[i]);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
