package Practice;

public class CheckStringIsPlaindroneOrNot {

    public static void main(String[] args) {
        System.out.println(solve("abbba",0,4));
    }
    public static boolean solve(String s,int i,int j){
        if(j<=i){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        boolean result = false;
        if(s.charAt(i)==s.charAt(j)){
           result = solve(s,i+1,j-1);
        }
        return result;
    }
}
