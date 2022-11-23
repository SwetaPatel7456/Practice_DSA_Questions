package Practice;

public class BalancedParenthesis {

    static int result =0;

    public static void main(String[] args) {
      balancedParenthesis(100,1000,"");
        System.out.println(result);
    }
    public  static  void balancedParenthesis(int open,int close,String op){

        if(close==0 && open==0){
            result++;
            System.out.println(op);
            return;
        }
        else if(open==close){
            op = op+"(";
            balancedParenthesis(open-1,close,op);
        }
        else if(open<close && open!=0){
            String op1 ="";
            String op2= "";
            op1 = op+ "(";
            balancedParenthesis(open-1,close,op1);
            op2 = op+ ")";
            balancedParenthesis(open,close-1,op2);
        }
        else if(open==0 && close!=0 ){
            op = op+")";
            balancedParenthesis(open,close-1,op);

        }
    }
}
