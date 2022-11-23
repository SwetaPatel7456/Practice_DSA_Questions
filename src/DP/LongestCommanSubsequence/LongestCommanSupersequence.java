package DP.LongestCommanSubsequence;

import static java.lang.Math.max;

public class LongestCommanSupersequence {

    public static void main(String[] args) {
        String  s1 = "abcd";
        String s2 = "abc";
        int m = s1.length();
        int n = s2.length();
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        printsupersequnce(c1,c2,m,n);


    }
    public static void printsupersequnce( char[] s1,char[] s2,int m ,int n){

        int t[][] = new int[m+1][n+1];
        //table initialisation
        for(int i =0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0|| j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i = 1;i<m+1;i++){
            for(int j =1;j<n+1;j++){
                if(s1[i-1]==s2[j-1]){
                    t[i][j] = 1+ t[i-1][j-1];
                }
                else{
                    t[i][j] = max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int lengthOfSuperSequence = (s1.length+s2.length)-(t[m][n]);
        String lcSuperSequence = "";
        int i = m;
        int j = n;
        while (i>0 && j>0){
            if(s1[i-1] ==s2[j-1]){
                lcSuperSequence =lcSuperSequence + s1[i-1];
                i--;j--;
            }
            else {
                if(t[i-1][j]>t[i][j-1]){
                    lcSuperSequence = lcSuperSequence+s1[i-1];
                    i--;
                }
                else {
                    lcSuperSequence = lcSuperSequence+s2[j-1];
                    j--;

                }
            }
        }
        System.out.println(lengthOfSuperSequence);
        System.out.println(lcSuperSequence);
    }


}
