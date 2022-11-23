package LeetCode;

import java.util.Arrays;

public class TwoSumWithSortedArray {

    public static void main(String[] args) {
        int a[]= {1,2,3,4};
        int c[] = twoSum(a,7);
        System.out.println(Arrays.toString(c));
    }

    public static int[] twoSum(int a[] ,int target){

        int i = 0;
        int j = a.length-1;


        while (i<j){
            if(a[i]+a[j]==target){
                return  new int[]{i,j};
            }
            else if(a[i]+a[j]>target){
                j--;
            }
            else if(a[i]+a[j]<target){
                i++;
            }
        }
        return null;
    }
}
