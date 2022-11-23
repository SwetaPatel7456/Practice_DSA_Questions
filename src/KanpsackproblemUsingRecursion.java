import static java.lang.Math.max;

public class KanpsackproblemUsingRecursion {

    static int[][] t = new int[5][8];


    public static void main(String[] args) {
        int weight[] = {1,3,4,5};
        int value[] ={1,4,5,7};

        for(int i = 0;i<5;i++){
            for(int j = 0 ;j<8;j++){
                t[i][j] = -1;
            }
        }
        System.out.println(knapsackUsingTopDown(weight,value,7,4));
        System.out.println(knapsack(weight,value,7,4));
        System.out.println(knapsackUsingMemoization(weight,value,7,4));
    }

    public static int knapsack(int weight[],int profit[],int w,int n){
        if(w==0 || n==0){
            return 0;
        }
        if(weight[n-1]<=w){
            return max(profit[n-1] +knapsack(weight,profit,w-weight[n-1],n-1),knapsack(weight,profit,w,n-1));
        }
        else{
            return knapsack(weight,profit,w,n-1);
        }
    }

    public static int knapsackUsingMemoization(int weight[],int profit[],int w,int n){

        if(w==0 || n==0){
            return 0;
        }
         else if(t[n][w]!=-1){
            return t[n][w];
        }
        else if(weight[n-1]<=w){
            return t[n][w] = max(profit[n-1] +knapsack(weight,profit,w-weight[n-1],n-1),knapsack(weight,profit,w,n-1));
        }
        else{
            return t[n][w] =knapsack(weight,profit,w,n-1);
        }

    }

    public static int knapsackUsingTopDown(int weight[],int profit[],int w,int n){

        int K[][] = new int[n+1][w+1];

        for(int i = 0;i<=n;i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    K[i][j] = 0;
                }
            }
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1 ;j<=w;j++){

                if (weight[i-1] <= j) {
                    K[i][j] = max(profit[i-1] + K[i-1][j-weight[i-1]],K[i-1][j] );
                }
                else{
                    K[i][j] = K[i-1][j];
                }
                }
            }
        return K[n][w];
        }




}



