package BinaryTree;

import java.util.Arrays;

public class PermutationOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        solve(a,0);
    }
    public static void solve(int a[],int index){

        if(index>=a.length){
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = index;i<a.length;i++){
            swap(a,index,i);
            solve(a,index+1);
            //backtrack
            swap(a, index,i);
        }
    }

    private static void swap(int[] a, int index, int i) {
        int temp = a[index];
        a[index]=a[i];
        a[i] = temp;
    }
}
