public class SubsetSumProblem {

    public static void main(String[] args) {

        int a[] = {478 ,757 ,314, 471 ,729 ,100, 459 ,618};
        boolean result = solve(a,1963,8);
        System.out.println(result);
    }


    public static boolean solve(int a[],int sum,int n) {
        boolean K[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0 ) {
                    K[i][j] = false;
                }
                if(j==0){
                    K[i][j]=true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if(a[i-1]<=j) {
                    K[i][j] = K[i - 1][j - a[i - 1]] || K[i - 1][j];
                }
                else {
                    K[i][j] = K[i-1][j];
                }
            }
        }
        return K[n][sum];

    }
}
