package Heap;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortANearlySoretedArray {

    public static void main(String[] args) {
        int a[] = {6,5,3,2,8,10,9};
          sortNearlySortedArray(a,3);
    }
    public static void sortNearlySortedArray(int a[],int k){
        int b[] = new int[a.length];
        int j =0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i =0;i<a.length;i++){
            priorityQueue.add(a[i]);
            if(priorityQueue.size()>k){
                b[j++]= priorityQueue.poll();
            }
        }
        while (!priorityQueue.isEmpty()){
            b[j++] = priorityQueue.poll();
        }
        System.out.println(Arrays.toString(b));
    }
}
