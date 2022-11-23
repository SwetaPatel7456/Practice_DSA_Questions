package Practice;

public class LetterCaseChange {

    public static void main(String[] args) {
        String s= "A1B2C";
        solve("",s);
    }

    private static void solve(String output, String input) {

        if (input.length()==0){
            System.out.println(output);
            return;
        }
        String ip1 ="";
        if(input.length()>=2)
            ip1 = input.substring(1);
        String op1 = output +Character.toString(input.charAt(0)).toUpperCase();
        String op2 = output +Character.toString(input.charAt(0)).toLowerCase();
        solve(op1,ip1);
        solve(op2,ip1);



    }
}
