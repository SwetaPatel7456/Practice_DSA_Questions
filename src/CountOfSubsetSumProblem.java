public class CountOfSubsetSumProblem {

    public static void main(String[] args) {

        int a[] = {2,3,8,9};
        int result = solve(a,11,4);
        System.out.println(result);
    }

    public static int solve(int a[],int sum,int n) {
        int K[][] = new int[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0 ) {
                    K[i][j] = 0;
                }
                if(j==0){
                    K[i][j]=1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if(a[i-1]<=j) {
                    K[i][j] = K[i - 1][j - a[i - 1]] + K[i - 1][j];
                }
                else {
                    K[i][j] = K[i-1][j];
                }
            }
        }
        return K[n][sum];

    }
}
