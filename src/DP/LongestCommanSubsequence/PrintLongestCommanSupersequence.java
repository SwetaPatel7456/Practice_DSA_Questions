package DP.LongestCommanSubsequence;

import java.util.Set;

public class PrintLongestCommanSupersequence {

    static int m =6;
    static int n =5;
    static int t[][] = new int[m + 1][n + 1];

    public static void main(String[] args) {
        lcsDp("HELLO","GEEK",5,4);

    }


    public static void lcsDp(String x, String y, int m, int n) {

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        int i = m;
        int j =n;
        String result ="";
        while (i>=1 && j>=1){
            if(x.charAt(i-1)==y.charAt(j-1)){
                result =x.charAt(i-1)+result;
                i--;
                j--;
            }
            else{
                if(t[i-1][j]>t[i][j-1]){
                    result= x.charAt(i-1)+result;
                    i--;
                }
                else if(t[i][j-1]>=t[i-1][j]){
                    result=y.charAt(j-1)+result;
                    j--;
                }
            }
        }
        System.out.println(result);

    }


}
