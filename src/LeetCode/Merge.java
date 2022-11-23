package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Merge {
    public static void main(String[] args) {
        int nums1[] ={1,2,3,0,0,0};
        int nums2[] ={1,0,1,1};
        //merge(nums1,3,nums2,3);
       // boolean b= containsNearbyDuplicate(nums2,1);
        //System.out.println(b);
        int nums3[] = {-2147483648,2147483647};
        boolean c = containsNearbyAlmostDuplicate(nums3,1,1);
        System.out.println(c);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int i =0;
        int j =0;
        int k =0;
        int shift =0;

        while(k <(m+n) && j<n ){
            if(nums1[k]<=nums2[j] &&i<m ){
                k++;
                i++;

            }
            else{
                int l=(m-1)+shift++;
                while(l>=k){
                    nums1[l+1] = nums1[l];
                    l--;
                }
                nums1[k++] = nums2[j++];
            }
        }
        System.out.println(Arrays.toString(nums1));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int flag =0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                int j =  map.get(nums[i]);
                map.put(nums[i],i);
                if(Math.abs(i-j)<=k){
                    flag++;
                }
            }
        }
        if(flag>0){
            return true;
        }
        else
            return false;


    }

    public static  boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int flag =0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){

                if(nums[i]-nums[j]<=t && Math.abs(i-j)<=k && i!=j){
                    return true;
                }

            }
        }
        return false;




    }
}
