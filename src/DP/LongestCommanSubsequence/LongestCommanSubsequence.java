package DP.LongestCommanSubsequence;

import java.util.Arrays;

import static java.lang.Math.max;

public class LongestCommanSubsequence {
    static int t[][];

    public static void main(String[] args) {
        String x = "abcf";
        String y = "abcdef";
        int m = x.length();
        int n = y.length();
        // System.out.println(lcs(x,y,m,n));
        t = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                t[i][j] = -1;

            }

        }
        //System.out.println(lcsMemoize(x, y, m, n));
        System.out.println(lcsDp(x, y, m, n));
    }

    public static int lcs(String x, String y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        int result = -1;
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            result = 1 + lcs(x, y, m - 1, n - 1);
        } else {
            result = max(lcs(x, y, m - 1, n), lcs(x, y, m, n - 1));
        }
        return result;
    }

    public static int lcsMemoize(String x, String y, int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }
        if (t[m][n] != -1) {
            return t[m][n];
        }
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            t[m][n] = 1 + lcs(x, y, m - 1, n - 1);
        } else {
            t[m][n] = max(lcs(x, y, m - 1, n), lcs(x, y, m, n - 1));
        }
        return t[m][n];
    }

    public static int lcsDp(String x, String y, int m, int n) {

        int t[][] = new int[m + 1][n + 1];

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
                    t[i][j]  = max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        String lcs = "";
        int k = m;
        int l = n;
        while (k != 0 || l != 0) {
            if (x.charAt(k-1) == y.charAt(l-1)) {
                lcs = lcs + x.charAt(k-1);
                k--;
                l--;
            } else {
                if (t[k - 1][l] > t[k][l - 1])
                    k--;
                else
                    l--;
            }
        }
        System.out.println(lcs);
        return t[m][n];

    }
}









