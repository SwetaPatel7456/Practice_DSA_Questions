package DP.LongestCommanSubsequence;

import static java.lang.Math.max;

public class LongestCommanSubstring {

    public static void main(String[] args) {
        System.out.println(longestCommanSubstring("abcefgh","abcdefgh",7,8));
    }

    public static int longestCommanSubstring(String x, String y, int m, int n){

        int t[][] = new int[m+1][n+1];

        for(int i = 0;i<=m;i++) {
            for (int j = 0; j <=n; j++) {
                if(i==0 || j==0){
                    t[i][j] =0;
                }
            }
        }
        for(int i = 1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = 0;
                }
            }
        }
        int max = 0;
        for(int i = 1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                if(t[i][j]>max){
                max = t[i][j];
                }
            }
            }
        return max;
        }


}
