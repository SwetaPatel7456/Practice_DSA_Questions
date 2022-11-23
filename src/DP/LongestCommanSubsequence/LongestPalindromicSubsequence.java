package DP.LongestCommanSubsequence;

public class LongestPalindromicSubsequence {

    public static void main(String[] args) {
        System.out.println(longestPalinSubseq("agbcba"));
    }

    public static int longestPalinSubseq(String S)
    {
        //code here
        String r="";
        int m = S.length();
        for(int i =m-1;i>=0;i--){
            r= r + S.charAt(i);
        }
        System.out.println(r);

        int t[][] = new int[m+1][m+1];

        for(int i =0;i<=m;i++){
            for(int j=0;j<=m;j++){
                if(i==0|| j==0){
                    t[i][j]=0;
                }
            }
        }

        for(int i = 1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(S.charAt(i-1)==r.charAt(j-1)){
                    t[i][j] = 1+ t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][m];
    }
}
