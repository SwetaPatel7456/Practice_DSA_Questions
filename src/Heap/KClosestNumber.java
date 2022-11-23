package Heap;


import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestNumber {

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
         solve(a,4,3);
    }
    public static void solve(int a[],int k,int x){
        int difference[] = new int[a.length];
        for(int i =0;i<a.length;i++){
            difference[i] = Math.abs(a[i]-x);
        }
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<a.length;i++){
            Pair  pair = new Pair(difference[i],a[i]);
            priorityQueue.add(pair);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        while (!priorityQueue.isEmpty()){
            ans.add(priorityQueue.poll().value);
        }
        while (!ans.isEmpty()){
            System.out.println(ans.poll());
        }
    }
}
