package DP.LongestCommanSubsequence;

import java.util.ArrayList;
import java.util.List;

public class all_longest_common_subsequences {

    public static void main(String[] args) {
        List<String> list  = all_longest_common_subsequences("abaaa","baabaca");
        System.out.println(list);
    }

    public static List<String> all_longest_common_subsequences(String s, String t)
    {
        // Code here
        int k[][] = new int[s.length()+1][t.length()+1];
        int x = s.length();
        int y = t.length();
        for(int i =0;i<=x;i++){
            for(int j =0;j<=y;j++){
                if(i==0|| j==0){
                    k[i][j] = 0;
                }
            }
        }

        for(int i =1;i<=x;i++){
            for(int j =1;j<=y;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    k[i][j]= 1+ k[i-1][j-1];
                }
                else{
                    k[i][j]= Math.max(k[i-1][j],k[i][j-1]);
                }
            }

        }
        List<String> result = findAllLCS(s,t,s.length(),t.length(),k);
        return result;
    }

    public static List<String> findAllLCS(String s ,String t,int m, int n ,int k[][]){

        List<String> list = new ArrayList<String>();

        if(m==0 || n==0){
            list.add("");
            return list;
        }
        if(s.charAt(m-1)==t.charAt(n-1)){
            List<String> temp = findAllLCS(s,t,m-1,n-1,k);

            for(String s1:temp){
                list.add(s1+s.charAt(m-1));
            }
        }
        else{
            if(k[m-1][n]>=k[m][n-1]){
                list =  findAllLCS(s,t,m-1,n,k);
            }

            if(k[m][n-1]>=k[m-1][n]){
                List<String> temp = findAllLCS(s,t,m,n-1,k);
                list.addAll(temp);

            }
        }
        return list;

    }
}
