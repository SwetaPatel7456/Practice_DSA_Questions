package Stack;

public class TaregetSum {

    //in a given array  before every element there is choice of plus minus sign and get ootput something suppose 1
    //int a[] = {1,1,2,3}  {+1,+1,+2,-3}
    //this problem reduced to (1,1,2)-(3)
    //means differnce of subset is 1
    //reduced to count number of subset with given differnce
    static int arr[] = {2,3};
    static int output = 1;

    public static void main(String[] args) {
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        int targetSum = (output+sum)/2;
        System.out.println(SumOfSubsetProblem(targetSum));

    }

    public static int SumOfSubsetProblem(int sum){

        int  t[][] = new int [arr.length+1][sum+1];
        for(int i = 0;i< arr.length+1;i++) {
            for (int j = 0; j <sum+1; j++) {
                if(i==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 0;i< arr.length+1;i++) {
            for (int j = 0; j <sum+1; j++) {
                if(j==0){
                    t[i][j] = 1;
                }
            }
        }

        for(int i = 1;i< arr.length+1;i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]<= j){
                    t[i][j]  = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[arr.length][sum];
    }
}
