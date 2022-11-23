package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int b[] = {0,0,1,1,1,2,2,3,3,4};
      //  int c[] = removeDuplicates(b);
      //  System.out.println(Arrays.toString(c));
        System.out.println(removeDuplicates3(b));
    }

        public static  int[] removeDuplicates(int[] nums) {
            int b[] = new int[nums.length];
            int j =0;
            for(int i = 0 ;i<nums.length;i++){
                if(i==0){
                    b[j++] = nums[i];
                }
                else if(nums[i]!=nums[i-1]){
                    b[j++] = nums[i];
                }
            }
            return b;

        }
        public static int removeDuplicatesusingList(int[] nums) {
            //int b[] = new int[nums.length];
            List<Integer> list = new ArrayList<>();
            int j =0;
            for(int i = 0 ;i<nums.length;i++){
                if(i==0){
                    //b[j++] = nums[i];
                    list.add(nums[i]);
                }
                else if(nums[i]!=nums[i-1]){
                    //b[j++] = nums[i];
                    list.add(nums[i]);

                }
            }
            for(int k =0;k<list.size();k++){
                nums[k] =list.get(k);
            }
            return nums[list.size()-1];

        }
    public static int removeDuplicates3(int[] nums) {
        int i =0;
        int j =0;
        while(i<nums.length){
            if(i==0){
                nums[j++] = nums[i];
                i++;

            }
            else if(nums[i]==nums[i-1]){
                i++;
            }
            else if(nums[i]!=nums[i-1]){
                nums[j++] = nums[i];
                i++;
            }
        }
        return nums[j-1];


    }
    }


