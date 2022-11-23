package DP.LongestCommanSubsequence;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class PrintAllLCS {
    static int m =6;
    static int n =8;
    static int t[][] = new int[m + 1][n + 1];

    public static void main(String[] args) {
        lcsDp("abaaa","baabaca",5,7);
        System.out.println(t[5][7]);
        Set<String> set = getAllLCS("abaaa","baabaca",5,7);
        for (String q : set){
            System.out.println(q);
        }

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

    }

    public static Set<String> getAllLCS(String s, String u, int m, int n){

        Set<String> list = new HashSet<String>();

        if(m==0 || n==0){
            list.add("");
            return list;
        }
        if(s.charAt(m-1)==u.charAt(n-1)){
            Set<String> temp = getAllLCS(s,u,m-1,n-1);

            for(String s1:temp){
                list.add(s1+s.charAt(m-1));
            }
        }
        else{
            if(t[m-1][n]>=t[m][n-1]){
                list =  getAllLCS(s,u,m-1,n);
            }

            if(t[m][n-1]>=t[m-1][n]){
                Set<String> temp = getAllLCS(s,u,m,n-1);
                list.addAll(temp);

            }
        }
        return list;

    }
}
