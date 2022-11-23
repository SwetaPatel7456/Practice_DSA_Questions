package Practice;

public class PermutationWithSpace {

    public static void main(String[] args) {
        String s= "ABC";
        solve(Character.toString(s.charAt(0)),s.substring(1));
    }

    private static void solve(String output, String input) {

        if (input.length()==0){
            System.out.println(output);
            return;
        }
        String ip1 ="";
        if(input.length()>=2)
            ip1 = input.substring(1);
        String op1 = output + "_"+input.charAt(0);
        String op2 = output +input.charAt(0);
        solve(op1,ip1);
        solve(op2,ip1);



    }
}
