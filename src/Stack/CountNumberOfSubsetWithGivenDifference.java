package Stack;

public class CountNumberOfSubsetWithGivenDifference {

    static int arr[] = {1,1,2,3};
    int differnce = 1;
    //s1-s2 = difference
    //s1=s2 = sum(1+1+2+3)
    //s1 = (sum+difference)/2
    public static void main(String[] args) {
        int s1 = (7+1)/2;
        System.out.println(SumOfSubsetProblem(s1));

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
