package Stack;

import java.util.Arrays;

public class CoinChangeProblem {

    //unbounded knapsack
    //total no of ways getting a perfect sum from these type of coins coins are umlimited
    static int coinsvalue[] = {1,2};
    //int sum = 5;
    //it means we want sum from these coins but any coin can use any no of times.
    //sumOfSubsetProblem but using unbounded knapsack

    public static void main(String[] args) {

        System.out.println(CoinChangeProblem());
    }

    public static  int CoinChangeProblem(){
        int sum = 5;

//        for(int i =0;i<coinsvalue.length;i++){
//            sum  = sum+coinsvalue[i];
//        }
        int t[][] = new int[coinsvalue.length+1][sum+1];
        //initialisation of array
        for(int i =0;i<=coinsvalue.length;i++){
            for(int j =0;j<=sum;j++){
                if(i==0 && j== 0)
                    t[i][j] = 1;
                else if( i==0){
                    t[i][j] =0;
                }
                else if(j == 0){
                    t[i][j] =1;
                }
            }
        }

        for(int i =1;i<=coinsvalue.length;i++) {
            for (int j = 1; j <= sum; j++) {
                if(coinsvalue[i-1]<= j){
                    t[i][j] = t[i][j-coinsvalue[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        int b[] =new int[sum+1];
        for(int i =0;i<= coinsvalue.length;i++){
         for(int j =0 ;j<=sum;j++){
             b[j]=t[i][j];

         }
            System.out.println(Arrays.toString(b));

        }


        return t[coinsvalue.length][sum];

    }
}
