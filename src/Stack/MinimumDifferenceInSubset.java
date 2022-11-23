package Stack;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class MinimumDifferenceInSubset {
    public static void main(String[] args) {
        System.out.println(minimumDifferenceInSubset());
    }

    public static int minimumDifferenceInSubset(){
        int arr[] = {1,2,3,4,10};
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum =sum+arr[i];
        }
        int length = sum/2;
        boolean vector[] = SumOfSubsetProblem(arr,sum);
        System.out.println(Arrays.toString(vector));
        int mn = Integer.MAX_VALUE;
        for(int i =1;i<=length;i++){
            if(vector[i]==true   && mn > (sum-(2*i))){
                mn = (sum - (2*i));
            }
        }
        return  mn;
    }

    public static boolean[] SumOfSubsetProblem(int [] arr,int sum){
        boolean  t[][] = new boolean [arr.length+1][sum+1];
         boolean vector[] = new boolean[sum+1];
        for(int i = 0;i< arr.length+1;i++) {
            for (int j = 0; j <sum+1; j++) {
                if(i==0){
                    t[i][j] = false;
                }
            }
        }
        for(int i = 0;i< arr.length+1;i++) {
            for (int j = 0; j <sum+1; j++) {
                if(j==0){
                    t[i][j] = true;
                }
            }
        }

        for(int i = 1;i< arr.length+1;i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]<= j){
                    t[i][j]  = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        for(int j=0;j<=sum;j++){
            vector[j] = t[arr.length][j];
        }
        return vector;
    }


}

