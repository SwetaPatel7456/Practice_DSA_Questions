package MCM;

import java.util.Arrays;
import java.util.Collections;

public class PalindromePartitioningRecursive {
    public static void main(String[] args) {
        String s = "nitinp";
        char[] c = s.toCharArray();
        System.out.println( ppr(c,0,5));
    }

    public static int ppr(char[] s,int i ,int j){
        if(i>=j){
            return 0;
        }
        if(isPalindrone(s,i,j)){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k =i;k<j;k++ ){
           int temp =  ppr(s,i,k)+ppr(s,k+1,j)+1;
           if(temp<min){
               min =temp;
           }
        }
        return min;
    }

    private static boolean isPalindrone(char[] s, int i, int j) {
        String c= "";
        String d="";
        for (int k =i ;k<=j;k++){
            c = c+ s[k];
        }
        for (int k =j ;k>=i;k--){
            d = d+ s[k];
        }
        if(c.equals(d)){
            return  true;
        }
        return false;
    }
}
