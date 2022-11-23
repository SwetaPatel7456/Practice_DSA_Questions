import java.util.Arrays;

public class SuffeledSubstringOfAnotherString {

    public static void main(String[] args) {

        System.out.println(solve("onetwofour","hellofourtwooneworld"));

    }

    public static boolean solve(String str1,String str2){
        int length = str1.length();

        char temp1[] = str1.toCharArray();
        Arrays.sort(temp1);

        for(int i =0;i<str2.length()-length;i++){
             char temp2[] = str2.substring(i,i+length).toCharArray();
             Arrays.sort(temp2);
             if(Arrays.equals(temp1,temp2)){
                 return true;
             }
        }
        return false;
    }
}
