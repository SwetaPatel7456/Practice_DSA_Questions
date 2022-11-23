package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfSubsetProblem {

    static int arr[] = {2,3,7};

    public static void main(String[] args) {
        System.out.println(SumOfSubsetProblem(11));
        System.out.println(equalSumPartitionProblem());
        boolean b = Arrays.stream(arr).boxed().collect(Collectors.toSet()).size() != arr.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

    }
    public static boolean SumOfSubsetProblem(int sum){
        boolean  t[][] = new boolean [arr.length+1][sum+1];
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
        return t[arr.length][sum];
        }

        public static  boolean  equalSumPartitionProblem(){
        int sum = 0;
        for(int i = 0;i< arr.length;i++) {
            sum = sum+arr[i];
        }
        if(sum%2!=0){
            return  false;
        }
        else
            return SumOfSubsetProblem(sum/2);



            }
    }

