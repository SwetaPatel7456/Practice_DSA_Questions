public class EqualSumPartitionProblem {

    public static void main(String[] args) {
        int arr[] ={478 ,757 ,314, 471 ,729 ,100, 459 ,618};
        System.out.println(equalPartition(8,arr));
    }

    static int equalPartition(int N, int arr[])
    {
        // code here

        int sum =0;
        for(int i= 0;i<N;i++){
            sum = sum+arr[i];
        }
        int result;
        if(sum%2!=0){
            result= 0;
        }
        else{
            int s1 = sum/2;
            if(subsetSum(N,arr,s1)){
                result =1;
            }
            else{
                result =0;
            }
        }
        return result;
    }

    static boolean subsetSum(int N,int arr[],int sum){

        boolean K[][] = new boolean[N+1][sum+1];


        for(int i =0;i<=N;i++){
            for(int j =0;j<=sum;j++){
                if(i==0){
                    K[i][j]=false;
                }
                if(j==0){
                    K[i][j]= true;
                }

            }
        }
        for(int i =1;i<=N;i++){
            for(int j = 1;j<=sum;j++){

                if(arr[i-1]<=j){
                    K[i][j] = K[i-1][j-arr[i-1]] ||K[i-1][j];
                }
                else{
                    K[i][j] = K[i-1][j];
                }
            }
        }

        return K[N][sum];

    }
}
