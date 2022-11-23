package Heap;

import java.util.PriorityQueue;

public class KthLargestElement {

    //by default priority queue create min heap

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        System.out.println(kthLargestElement(a,3));
    }
    public static int kthLargestElement(int a[],int k){
        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>();
        for (int i = 0;i<a.length;i++){

            priorityQueue.add(a[i]);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        int top = priorityQueue.peek();
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        return top;
    }
}
