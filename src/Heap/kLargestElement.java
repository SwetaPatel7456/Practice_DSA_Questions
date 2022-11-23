package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kLargestElement {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        List<Integer> ans = kLargestElement(a,3);
        System.out.println(ans);
    }
    public static List<Integer> kLargestElement(int a[],int k){
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0;i<a.length;i++){

            priorityQueue.add(a[i]);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        int top = priorityQueue.peek();
        while (!priorityQueue.isEmpty()) {
            ans.add(priorityQueue.poll());
        }
        return ans;
    }
}
